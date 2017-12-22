package coursemanagesystem.service;

import java.math.BigInteger;
import java.util.List;

import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.SeminarGroupMember;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.*;

public interface SeminarGroupService {

	/**
	 * 成为组长.
	 * <p>同学按小组id和自身id成为组长<br>
	 * @param groupId 小组id
	 * @param userId  学生id
	 * @return true/false 返回成为组长是否成功
	// * @exception  信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 * @exception UserNotFoundException 不存在该学生
	 * @exception InvalidOperationException 已经有组长了
	 */
	void assignLeaderById(BigInteger groupId,BigInteger userId) throws
			UserNotFoundException,GroupNotFoundException,
			InvalidOperationException;

	/**
	 * 自动分组.
	 * ＜p＞根据讨论课id和班级id，对签到的学生进行自动分组<br>*
	 * @author YeHongjie
	 * @param seminarId 讨论课的id
	 * @param classId 班级的id
	 //* @exception  信息不合法，id格式错误
	 * @exception ClassesNotFoundException 未找到班级
	 * @exception SeminarNotFoundException 未找到讨论课
	 */
	void automaticallyGrouping(BigInteger seminarId,BigInteger classId) throws
			ClassesNotFoundException,SeminarNotFoundException;

	/**
	 * 删除讨论课小组.
	 * ＜p＞按照id删除讨论课小组<br>*
	 * @author YeHongjie
	 * @param seminarGroupId 讨论课小组的id
	 * @return Boolean 若创建成功返回true，失败返回false
	 * @see SeminarGroupService #deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId)
	// * @exception  信息不合法，id格式错误
	 */
	void deleteSeminarGroupByGroupId(BigInteger seminarGroupId);

	/**
	 * 按seminarId删除讨论课小组信息.
	 * <p>根据seminarId获得SeminarGroup，然后根据SeminarGroupId删除SeminarGroupMember信息，最后再删除SeminarGroup信息<br>
	 * @author zhouzhongjun
	 * @param seminarId 讨论课Id
	 * @see SeminarGroupService #listSeminarGroupBySeminarId(BigInteger seminarId)
	 * @see SeminarGroupService #deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId)
	 * @return true删除成功 false删除失败
	// * @exception  信息不合法，id格式错误
	 */
	void deleteSeminarGroupBySeminarId(BigInteger seminarId);


	/**
	 * 按seminarGroupId删除SeminarGroupMember信息.
	 * @author zhouzhongjun
	 * @param seminarGroupId 讨论课小组Id
	 * @return true/false 是否成功删除
	 */
	void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId);


	/**
	 * 查询讨论课小组.
	 * ＜p＞按照id查询某一讨论课小组的信息（包括成员）<br>*
	 * @author YeHongjie
	 * @param groupId 小组的id
	 * @return seminarGroup 讨论课小组对象，若未找到相关小组返回空(null)
	 * @see SeminarGroupService #listSeminarGroupMemberByGroupId(BigInteger groupId)
	// * @exception  (信息不合法，id格式错误)
	 * @exception GroupNotFoundException (未找到小组)
	 */
	SeminarGroup getSeminarGroupByGroupId(BigInteger groupId) throws
			GroupNotFoundException;

	/**
	 * 根据讨论课Id及用户id，获得该用户所在的讨论课的小组的信息.
	 * @param seminarId (讨论课的id)
	 * @param userId（用户的id）
	 * @return SeminarGroup Group的相关信息
	// * @exception  信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 */
	SeminarGroup getSeminarGroupById(BigInteger seminarId,BigInteger userId) throws
			GroupNotFoundException;


	/**
	 * 查询讨论课小组队长id.
	 * <p>按照讨论课小组id查询该小组的队长id<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的讨论课小组id
	 * @return leaderId 讨论课小组队长id
	// * @exception InfoIllegalException 信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 */
	BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId) throws
			GroupNotFoundException;


	/**
	 * 获取学生所在讨论课队长.
	 * ＜p＞按照用户id和讨论课id获取学生所在讨论课小组队长<br>*
	 * @author YeHongjie
	 * @param userId 用户的id
	 * @param seminarId 讨论课id
	 * @return BigInteger 讨论课小组的队长id，若未找到相关小组队长返回空(null)
	 * @see SeminarGroupService #getSeminarGroupById(BigInteger userId, BigInteger seminarId)
	 * @see SeminarGroupService #getSeminarGroupLeaderByGroupId(BigInteger groupId)
	// * @exception InfoIllegalException 信息不合法，id格式错误
	 */
	BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId);

	/**
	 * 创建讨论课小组.
	 * ＜p＞在指定讨论课下创建讨论课小组<br>*
	 * @author YeHongjie
	 * @param seminarId 讨论课的id
	 * @param seminarGroup 小组信息
	 * @see SeminarGroupService #insertSeminarGroupMemberByGroupId(BigInteger groupId,SeminarGroupMember SeminarGroupMember)
	 * @return BigInteger 若创建成功返回该小组的id，失败则返回-1
	 //* @exception InfoIllegalException 信息不合法，id格式错误
	 */
	BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId,
											 SeminarGroup seminarGroup);


	/**
	 * 创建小组成员信息.
	 * ＜p＞在指定小组成员表下创建一个新的小组信息<br>*
	 * @param groupId 小组的id
	 * @param seminarGroupMember 小组成员信息
	 * @return BigInteger 若创建成功返回该小组成员表的id，失败则返回-1
	 */
	BigInteger insertSeminarGroupMemberByGroupId(BigInteger groupId,
												 SeminarGroupMember seminarGroupMember);


	/**
	 * 将学生加入讨论课小组.
	 * <p>将用户加入指定的讨论课小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入讨论课小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	// *@exception InfoIllegalException (信息不合法，id格式错误)
	 *@exception GroupNotFoundException (未找到小组)
	 *@exception UserNotFoundException (不存在该学生)
	 *@exception InvalidOperationException （待添加学生已经在小组里了）
	 */
	BigInteger insertSeminarGroupMemberById(BigInteger userId,BigInteger groupId)
			throws GroupNotFoundException,UserNotFoundException, InvalidOperationException;




	/**
	 * 小组按id选择话题.
	 * <p>小组通过小组id和话题id选择讨论课的话题<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @param topicId 话题id
	 * @return String 返回一个url
	 //* @exception InfoIllegalException GroupId、TopicId格式错误时抛出
	 * @exception GroupNotFoundException 该小组不存在时抛出
	 */
	BigInteger insertTopicByGroupId(BigInteger groupId, BigInteger topicId) throws
			GroupNotFoundException;


	/**
	 * 根据话题Id获得选择该话题的所有小组的信息.
	 * @param  topicId 话题的id
	 * @return List 所有选择该话题的所有group的信息
	// * @exception InfoIllegalException 信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 */
	List<SeminarGroup> listGroupByTopicId(BigInteger topicId) throws
			GroupNotFoundException;


	/**
	 * 按seminarId获取SeminarGroup.
	 * @author zhouzhongjun
	 * @param seminarId 课程Id
	 * @return 讨论课小组列表
	// * @exception InfoIllegalException 信息不合法，id格式错误
	 * @exception SeminarNotFoundException 未找到讨论课
	 */
	List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId) throws
			SeminarNotFoundException;


	/**
	 * 获取某学生所有的讨论课小组.
	 * <p>根据学生id获取学生所在的（之前参加过的）所有讨论课小组的信息<br>
	 * @author qinlingyun
	 * @param userId 学生id
	 * @return list 讨论课小组列表
	// * @exception InfoIllegalException 信息不合法，id格式错误
	 */
	List<SeminarGroup> listSeminarGroupIdByStudentId(BigInteger userId);


	/**
	 * 查询讨论课小组成员.
	 * <p>按照讨论课小组id查询该小组的成员<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的讨论课小组id
	 * @return List 讨论课小组成员信息
	// * @exception InfoIllegalException 信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 */
	List<User> listSeminarGroupMemberByGroupId(BigInteger groupId) throws
			GroupNotFoundException;

	/**
	 * 组长辞职.
	 * <p>同学按小组id和自身id,辞掉组长职位<br>
	 * @param groupId 小组id
	 * @param userId  学生id
	 * @return true/false 返回组成辞职是否成功
	// * @exception InfoIllegalException (信息不合法，id格式错误)
	 * @exception GroupNotFoundException (未找到小组)
	 */
	void resignLeaderById(BigInteger groupId,BigInteger userId) throws
			GroupNotFoundException;

}
