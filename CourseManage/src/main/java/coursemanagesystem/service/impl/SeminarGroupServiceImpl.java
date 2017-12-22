package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.util.List;

import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.SeminarGroupMember;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.GroupNotFoundException;
import coursemanagesystem.exception.InvalidOperationException;
import coursemanagesystem.exception.UserNotFoundException;
import coursemanagesystem.mapper.SeminarGroupMapper;
import coursemanagesystem.service.SeminarGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SeminarGroupServiceImpl implements SeminarGroupService {
	/**
	 * 按seminarGroupId删除SeminarGroupMember信息.
	 * @author zhouzhongjun
     * @param seminarGroupId 讨论课小组Id
     *  @return true/false 是否成功删除
	 */
	@Autowired
	private SeminarGroupMapper SeminarGroupMapper;
    /**
     * 按seminarGroupId删除SeminarGroupMember信息.
     * @author zhouzhongjun
     * @param seminarGroupId 讨论课小组Id
     * @return true/false 是否成功删除
     */
	public void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {
		SeminarGroupMapper.deleteSeminarGroupMemberBySeminarGroupId(seminarGroupId);
	};
	
	/**
	 * 将学生加入讨论课小组.
	 * <p>将用户加入指定的讨论课小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入讨论课小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */

     //throws IllegalArgumentException,UserNotFoundException,GroupNotFoundException,InvalidOperationException
	public BigInteger insertSeminarGroupMemberById(BigInteger userId,BigInteger groupId) {
		BigInteger id=SeminarGroupMapper.insertSeminarGroupMemberById(userId,groupId);
		return id;
    }
    
	/**
	 * 查询讨论课小组成员.
	 * <p>按照讨论课小组id查询该小组的成员<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的讨论课小组id
	 * @return List 讨论课小组成员信息
	 */

	public List<User> listSeminarGroupMemberByGroupId(BigInteger groupId) {
    	List<User> users=SeminarGroupMapper.listSeminarGroupMemberByGroupId(groupId);
    	return users;
    }
    
	/**
	 *
	 * 获取某学生所有的讨论课小组.
	 * <p>根据学生id获取学生所在的所有讨论课小组的id<br>
	 * @author qinlingyun
	 * @param userId 学生id
	 * @return list 讨论课小组列表
	 */

	public List<SeminarGroup> listSeminarGroupIdByStudentId(BigInteger userId) {
    	List<SeminarGroup> serminarGroups = SeminarGroupMapper.listSeminarGroupIdByStudentId(userId);
    	return serminarGroups;
    }
    
    
    /**
	 * 查询讨论课小组队长id.
	 * <p>按照讨论课小组id查询该小组的队长id<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的讨论课小组id
	 * @return leaderId 讨论课小组队长id
	 */

	public BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId) {
    	BigInteger leaderId=SeminarGroupMapper.getSeminarGroupLeaderByGroupId(groupId);
    	return leaderId;
    }


	/**
	 * 按seminarId获取SeminarGroup.
	 * @author zhouzhongjun
     * @param seminarId 课程Id
     * @return null 讨论课小组列表
	 */

	public List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId) {
		List<SeminarGroup> seminarGroups=SeminarGroupMapper.listSeminarGroupBySeminarId(seminarId);
		return seminarGroups;
	};
	
	/**
	 * 按seminarId删除讨论课小组信息.
	 * <p>根据seminarId获得SeminarGroup，然后根据SeminarGroupId删除SeminarGroupMember信息，最后再删除SeminarGroup信息<br>  
	 * @author zhouzhongjun
     * @param seminarId 讨论课Id
	 * @see SeminarGroupServiceImpl #listSeminarGroupBySeminarId(BigInteger seminarId)
	 * @see SeminarGroupServiceImpl #deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId)
	 * @return true删除成功 false删除失败
	 */

	public void deleteSeminarGroupBySeminarId(BigInteger seminarId) {
		SeminarGroupMapper.deleteSeminarGroupMemberBySeminarGroupId(seminarId);
		SeminarGroupMapper.deleteSeminarGroupBySeminarId(seminarId);
	};


	/**
	 * 创建小组成员信息.
	 * ＜p＞在指定小组成员表下创建一个新的小组信息<br>*
	 * @param groupId 小组的id
	 * @param seminarGroupMember 小组成员信息
	 * @return BigInteger 若创建成功返回该小组成员表的id，失败则返回-1
	 */
	public BigInteger insertSeminarGroupMemberByGroupId(BigInteger groupId,
												 SeminarGroupMember seminarGroupMember){

		BigInteger seminarGroupMemberId = SeminarGroupMapper.insertSeminarGroupMemberByGroupId(groupId,seminarGroupMember);
		return seminarGroupMemberId;
	}

	/**
	 * 创建讨论课小组.
	 * ＜p＞在指定讨论课下创建讨论课小组<br>*
	 * @author YeHongjie
	 * @param seminarId 讨论课的id
	 * @param seminarGroup 小组信息
	 * @return BigInteger 若创建成功返回该小组的id，失败则返回-1
	 */

	public BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId,SeminarGroup seminarGroup) {
    	BigInteger seminarGroupId = SeminarGroupMapper.insertSeminarGroupBySeminarId(seminarId,seminarGroup);
    	return seminarGroupId;
    }
    
    /**
	 * 删除讨论课小组.
	 * ＜p＞按照id删除讨论课小组<br>*
	 * @author YeHongjie
	 * @param groupId 讨论课小组的id
	 * @return Boolean 若创建成功返回true，失败返回false
	 * @see SeminarGroupServiceImpl #deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId)
	 */

	public void deleteSeminarGroupByGroupId(BigInteger groupId) {
		SeminarGroupMapper.deleteSeminarGroupByGroupId(groupId);
    }
    
    /**
	 * 查询讨论课小组.
	 * ＜p＞按照id查询某一讨论课小组的信息（包括成员）<br>*
	 * @author YeHongjie
	 * @param groupId 小组的id
	 * @return seminarGroupBO 讨论课小组对象，若未找到相关小组返回空(null)
	 * @see SeminarGroupServiceImpl #listSeminarGroupMemberByGroupId(BigInteger groupId)
	 */

	public SeminarGroup getSeminarGroupByGroupId(BigInteger groupId) {
		SeminarGroup seminarGroup=SeminarGroupMapper.getSeminarGroupByGroupId(groupId);
    	return seminarGroup;
    }


	/**
	 * 根据讨论课Id及用户id，获得该用户所在的讨论课的小组的信息.
	 * @param seminarId (讨论课的id)
	 * @param userId（用户的id）
	 * @return SeminarGroup Group的相关信息
	// * @exception InfoIlleglException 信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 */
	public SeminarGroup getSeminarGroupById(BigInteger seminarId,BigInteger userId){
		SeminarGroup seminarGroup=SeminarGroupMapper.getSeminarGroupById(seminarId,userId);
		return seminarGroup;
	}


	/**
	 * 根据话题Id获得选择该话题的所有小组的信息.
	 * @param  topicId 话题的id
	 * @return List 所有选择该话题的所有group的信息
	 //* @exception InfoIllegalException 信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 */
	public List<SeminarGroup> listGroupByTopicId(BigInteger topicId){
		List<SeminarGroup> seminarGroupList=SeminarGroupMapper.listGroupByTopicId(topicId);
		return seminarGroupList;
	}


	/**
	 * 小组按id选择话题.
	 * <p>小组通过小组id和话题id选择讨论课的话题<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @param topicId 话题id
	 * @return String 返回一个url
	// * @exception InfoIllegalException GroupId、TopicId格式错误时抛出
	 * @exception GroupNotFoundException 该小组不存在时抛出
	 */
	public BigInteger insertTopicByGroupId(BigInteger groupId, BigInteger topicId){
		BigInteger seminarGroupTopicId=SeminarGroupMapper.insertTopicByGroupId(groupId,topicId);
		return seminarGroupTopicId;
	}


    /**
	 * 获取学生所在讨论课队长.
	 * ＜p＞按照用户id和讨论课id获取学生所在讨论课小组队长<br>*
	 * @author YeHongjie
	 * @param userId 用户的id
	 * @param seminarId 讨论课id
	 * @return BigInteger 讨论课小组的队长id，若未找到相关小组队长返回空(null)
	 * @see SeminarGroupServiceImpl #getSeminarGroupById(BigInteger userId, BigInteger seminarId)
	 * @see SeminarGroupServiceImpl #getSeminarGroupLeaderByGroupId(BigInteger groupId)
	 */

	public BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId) {
    	BigInteger leaderId=SeminarGroupMapper.getSeminarGroupLeaderById(userId,seminarId);
    	return leaderId;
    }



    /**
	 * 自动分组.
	 * ＜p＞根据讨论课id和班级id，对签到的学生进行自动分组<br>*
	 * @author YeHongjie
	 * @param seminarId 讨论课的id
	 * @param classId 班级的id
	 * @return Boolean 自动分组成功返回true，否则返回false
	 */

	public void automaticallyGrouping(BigInteger seminarId,BigInteger classId)
    {

    }

	/**
	 * 成为组长.
	 * <p>同学按小组id和自身id成为组长<br>
	 * @param groupId 小组id
	 * @param userId  学生id
	 * @return true/false 返回成为组长是否成功
	// * @exception InfoIllegalException 信息不合法，id格式错误
	 * @exception GroupNotFoundException 未找到小组
	 * @exception UserNotFoundException 不存在该学生
	 * @exception InvalidOperationException 已经有组长了
	 */
	public void assignLeaderById(BigInteger groupId,BigInteger userId){
		SeminarGroupMapper.assignLeaderById(groupId,userId);
	}


	/**
	 * 组长辞职.
	 * <p>同学按小组id和自身id,辞掉组长职位<br>
	 * @param groupId 小组id
	 * @param userId  学生id
	 * @return true/false 返回组成辞职是否成功
	// * @exception InfoIllegalException (信息不合法，id格式错误)
	 * @exception GroupNotFoundException (未找到小组)
	 */
	public void resignLeaderById(BigInteger groupId,BigInteger userId){
		SeminarGroupMapper.resignLeaderById(groupId,userId);
	}

}
