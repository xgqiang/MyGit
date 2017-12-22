package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.util.List;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.FixGroupNotFoundException;
import coursemanagesystem.service.FixGroupService;
import org.springframework.stereotype.Service;

@Service
public class FixGroupServiceImpl implements FixGroupService {
	/**
	 * 按FixGroupId删除FixGroupMember.
	 * @author zhouzhongjun
     * @param fixGroupId 固定分组Id
     * @return true删除成功  false删除失败
	 */

	public void deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId) {
		
		//删除自己
		return true;
	};
	
	/**
	 * 将学生加入固定小组.
	 * ＜p＞将用户加入指定的固定小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入固定小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */

	public BigInteger insertFixGroupMemberById(BigInteger userId,BigInteger groupId)
    {
    	BigInteger recordId = BigInteger.valueOf(-1);
    	return recordId;
    }
    
	/**
	 * 查询固定小组成员.
	 * ＜p＞按照固定小组id查询该小组的成员<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的固定小组id
	 * @return List 固定小组成员信息
	 */

	public List<User> listFixGroupMemberByGroupId(BigInteger groupId)
    {
    	List<User> userBOs=null;
    	return userBOs;
    }
	/**
	 * 按classId查找FixGroup信息.
	 * @author zhouzhongjun
     * @param classId 班级Id
     * @return null 固定分组列表
	 */

	public List<FixGroup> listFixGroupByClassId(BigInteger classId) {
		
		return null;
	};
	
	/**
	 * 按classId删除FixGroup
	 * <p>先根据classId得到所有的FixGroup信息，再根据FixGroupid删除FixGroupMember表的信息，最后再将FixGroup信息删除<br>  
	 * @author zhouzhongjun
     * @param classId 班级Id
     * @see FixGroupServiceImpl #listFixGroupByClassId(BigInteger classId)
     * @see FixGroupServiceImpl #deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId)
     * @return true删除成功  false删除失败
	 */

	public void deleteFixGroupByClassId(BigInteger classId) {
		
		//删除自己
		return true;
	};
    
    /**
	 * 创建固定小组.
	 * ＜p＞在指定班级下创建固定小组<br>*
	 * @author YeHongjie
	 * @param classId 班级的id
	 * @param fixGroupBO 小组信息
	 * @return BigInteger 若创建成功返回该小组的id，失败则返回-1
	 */

	public BigInteger insertFixGroupByClassId(BigInteger classId,FixGroup fixGroupBO)
    {
    	BigInteger fixGroupId = BigInteger.valueOf(-1);
    	return fixGroupId;
    }
    
    /**
	 * 删除固定小组.
	 * ＜p＞按照id删除固定小组<br>*
	 * @author YeHongjie
	 * @param groupId 固定小组的id
	 * @return state 若创建成功返回true，失败返回false
	 * @see FixGroupServiceImpl #deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId)
	 */

	public void deleteFixGroupByGroupId(BigInteger groupId)
    {
    	Boolean state=Boolean.valueOf(false);
    	return state;
    }
    
    /**
	 * 修改固定小组.
	 * ＜p＞修改固定小组的信息（不包括成员）<br>*
	 * @author YeHongjie
	 * @param groupId 小组的id
	 * @param fixGroupBO 小组信息
	 * @return Boolean 若创建成功返回true，失败返回false
	 */

	public void updateFixGroupByGroupId(BigInteger groupId,FixGroup fixGroupBO)
    {
    	Boolean state=Boolean.valueOf(false);
    	return state;
    }
    
    /**
	 * 查询固定小组.
	 * ＜p＞按照id查询某一固定小组的信息（包括成员）<br>*
	 * @author YeHongjie
	 * @param groupId 小组的id
	 * @return fixGroupBO 固定小组对象，若未找到相关小组返回空(null)
	 * @see FixGroupServiceImpl #listFixGroupMemberByGroupId(BigInteger groupId)
	 */

	public FixGroup getFixGroupByGroupId(BigInteger groupId)
    {
		FixGroup fixGroupBO=null;
    	return fixGroupBO;
    }
 

    /**
	 * 将学生加入小组.
	 * ＜p＞将用户加入指定的小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */

	public BigInteger insertStudnetIntoGroup(BigInteger userId,BigInteger groupId)
    {
    	BigInteger recordId = BigInteger.valueOf(-1);
    	return recordId;
    }

    /**
	 * 小组取消话题.
	 * <p>小组按小组id取消讨论课的话题的选择<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @return true or false 返回取消话题是否成功
	 */

	public void deleteTopicByGroupId(BigInteger groupId) {
		//TopicDao.deleteTopicByGroupId(BigInteger groupId)
		return true;
	}

    /**
	 * 按id获取小组.
	 * <p>通过学生id和班级id获取学生所在的班级固定小组<br>
	 * @author heqi
	 * @param userId 学生id
	 * @param classId 班级id
	 * @return GroupBO 返回班级固定小组的信息 
	 * @see UserServiceImpl#getUserByUserId(BigInteger UserId)
	 */

	public FixGroup getFixedGroupById(BigInteger userId,BigInteger classId){
		//rs = UserService.listMembersById(BigInteger userId);
		//for student_id in rs;
		//UserService.UserBO getUserByUserId(BigInteger UserId)
		//得到小组所有成员信息返回小组信息
		FixGroup groupBO = new FixGroup();
		return groupBO;
	}

        /**
	 * 小组按id选择话题.
	 * <p>小组通过小组id和话题id选择讨论课的话题<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @param topicId 话题id
	 * @return String 返回一个url
	 */

	public String insertTopicByGroupId(BigInteger groupId, BigInteger topicId){
		//TopicDao.insertTopicByGroupId(BigInteger groupId, BigInteger topicId)
		String url = null;
		return url;
	}

    /**
     * 根据groupId修改group.
     * <p>根据groupId修改group<br>
     * @author aixing
     * @param groupId 要修改的group的Id
     * @param group 新的group信息
     * @return
     */

	/**
	 * 根据groupId修改group.
	 * <p>根据groupId修改group<br>
	 * @author aixing
	 * @param groupId 要修改的group的Id
	 * @param group 新的group信息
	 * @return Boolean 若更新成功返回true，失败返回false
	 * @exception InfoIllegalException  信息不合法，id格式错误
	 * @exception FixGroupNotFoundException 未找到小组
	 */
	public void updateSeminarGroupById(BigInteger groupId,SeminarGroup group) throws
			InfoIllegalException,FixGroupNotFoundException{
		return false;
	}
}
