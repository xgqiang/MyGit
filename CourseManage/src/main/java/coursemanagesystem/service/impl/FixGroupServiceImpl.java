package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.util.List;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.FixGroupMember;
import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.ClassesNotFoundException;
import coursemanagesystem.exception.FixGroupNotFoundException;
import coursemanagesystem.exception.InvalidOperationException;
import coursemanagesystem.exception.UserNotFoundException;
import coursemanagesystem.mapper.FixGroupMapper;
import coursemanagesystem.service.FixGroupService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FixGroupServiceImpl implements FixGroupService {

	@Autowired
	private FixGroupMapper fixGroupMapper;

	/**
	 * 按FixGroupId删除FixGroupMember.
	 * @author zhouzhongjun
     * @param fixGroupId 固定分组Id
     * @return true删除成功  false删除失败
	 */

	public void deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId) throws
			IllegalArgumentException,FixGroupNotFoundException{
		fixGroupMapper.deleteFixGroupMemberByFixGroupId(fixGroupId);
	}
    
	/**
	 * 查询固定小组成员.
	 * ＜p＞按照固定小组id查询该小组的成员<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的固定小组id
	 * @return List 固定小组成员信息
	 */

	public List<User> listFixGroupMemberByGroupId(BigInteger groupId) throws
			IllegalArgumentException,FixGroupNotFoundException{
    	List<User> userList=fixGroupMapper.listFixGroupMemberByGroupId(groupId);
    	return userList;
    }
	/**
	 * 按classId查找FixGroup信息.
	 * @author zhouzhongjun
     * @param classId 班级Id
     * @return null 固定分组列表
	 */

	public List<FixGroup> listFixGroupByClassId(BigInteger classId) throws
			IllegalArgumentException{
		List<FixGroup> fixGroupList=fixGroupMapper.listFixGroupByClassId(classId);
		return fixGroupList;
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

	public void deleteFixGroupByClassId(BigInteger classId) throws
			IllegalArgumentException,ClassesNotFoundException{
		fixGroupMapper.deleteFixGroupByClassId(classId);
	};
    
    /**
	 * 创建固定小组.
	 * ＜p＞在指定班级下创建固定小组<br>*
	 * @author YeHongjie
	 * @param classId 班级的id
	 * @param userId 小组信息
	 * @return BigInteger 若创建成功返回该小组的id，失败则返回-1
	 */

	public BigInteger insertFixGroupByClassId(@Param("classId") BigInteger classId,@Param("userId") BigInteger userId) throws
			IllegalArgumentException, ClassesNotFoundException {
		FixGroup fixGroup=new FixGroup();
		fixGroupMapper.insertFixGroupByClassId(classId,userId,fixGroup);
		BigInteger fixGroupId =fixGroup.getId();
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

	public void deleteFixGroupByGroupId(BigInteger groupId) throws
			FixGroupNotFoundException,IllegalArgumentException{
		fixGroupMapper.deleteFixGroupByGroupId(groupId);
    }
    
    /**
	 * 修改固定小组.
	 * ＜p＞修改固定小组的信息（不包括成员）<br>*
	 * @author YeHongjie
	 * @param groupId 小组的id
	 * @param fixGroup 小组信息
	 * @return Boolean 若创建成功返回true，失败返回false
	 */

	public void updateFixGroupByGroupId(@Param("groupId") BigInteger groupId,@Param("fixGroup") FixGroup fixGroup) throws
			FixGroupNotFoundException,IllegalArgumentException{
		fixGroupMapper.updateFixGroupByGroupId(groupId,fixGroup);
    }
    
    /**
	 * 查询固定小组.
	 * ＜p＞按照id查询某一固定小组的信息（包括成员）<br>*
	 * @author YeHongjie
	 * @param groupId 小组的id
	 * @return fixGroupBO 固定小组对象，若未找到相关小组返回空(null)
	 * @see FixGroupServiceImpl #listFixGroupMemberByGroupId(BigInteger groupId)
	 */

	public List<FixGroupMember> getFixGroupByGroupId(BigInteger groupId) throws
			FixGroupNotFoundException,IllegalArgumentException{
		List<FixGroupMember> fixGroupMemberList=fixGroupMapper.getFixGroupByGroupId(groupId);
    	return fixGroupMemberList;
    }
 

    /**
	 * 将学生加入小组.
	 * ＜p＞将用户加入指定的小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */

	public BigInteger insertStudnetIntoGroup(@Param("userId") BigInteger userId,@Param("groupId") BigInteger groupId) throws
			FixGroupNotFoundException,UserNotFoundException,
			IllegalArgumentException,InvalidOperationException {
		FixGroupMember fixGroupMember=new FixGroupMember();
    	fixGroupMapper.insertStudnetIntoGroup(userId,groupId,fixGroupMember);
		BigInteger fixGroupMemberId =fixGroupMember.getId();
		return fixGroupMemberId;
    }

    /**
	 * 小组取消话题.
	 * <p>小组按小组id取消讨论课的话题的选择<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @return true or false 返回取消话题是否成功
	 */

	public void deleteTopicByGroupId(BigInteger groupId) throws
			IllegalArgumentException,FixGroupNotFoundException{
		fixGroupMapper.deleteTopicByGroupId(groupId);
	}

    /**
	 * 按id获取小组.
	 * <p>通过学生id和班级id获取学生所在的班级固定小组<br>
	 * @author heqi
	 * @param userId 学生id
	 * @param classId 班级id
	 * @return GroupBO 返回班级固定小组的信息
	 */

	public FixGroup getFixedGroupById(@Param("userId") BigInteger userId,@Param("classId") BigInteger classId) throws
			IllegalArgumentException,ClassesNotFoundException,UserNotFoundException{
		FixGroup fixGroup = fixGroupMapper.getFixedGroupById(userId,classId);
		return fixGroup;
	}


	/**
	 * 根据groupId修改group.
	 * <p>根据groupId修改group<br>
	 * @author aixing
	 * @param groupId 要修改的group的Id
	 * @param group 新的group信息
	 * @return Boolean 若更新成功返回true，失败返回false
	// * @exception InfoIllegalException  信息不合法，id格式错误
	 * @exception FixGroupNotFoundException 未找到小组
	 */
	public void updateSeminarGroupById(@Param("groupId") BigInteger groupId, @Param("group") SeminarGroup group) throws
			IllegalArgumentException,FixGroupNotFoundException{
		fixGroupMapper.updateSeminarGroupById(groupId,group);
	}
}
