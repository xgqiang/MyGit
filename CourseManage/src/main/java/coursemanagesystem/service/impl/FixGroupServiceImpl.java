package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.FixGroupMember;
import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.*;
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
			IllegalArgumentException, UserNotFoundException {
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
	 * 按FixGroupId和UserId删除FixGroupMember中某个学生.
	 * <p>按FixGroupId和UserId删除FixGroupMember中的某个学生<br>
	 *
	 * @param fixGroupId 固定分组Id
	 * @param userId     组员的Id
	 * @throws IllegalArgumentException  信息不合法，id格式错误
	 * @throws FixGroupNotFoundException 未找到小组
	 * @throws UserNotFoundException     不存在该学生
	 * @author zhouzhongjun
	 */
	public void deleteFixGroupUserById(@Param("fixGroupId") BigInteger fixGroupId, @Param("userId") BigInteger userId) throws
			IllegalArgumentException, FixGroupNotFoundException, UserNotFoundException{
		fixGroupMapper.deleteFixGroupUserById(fixGroupId,userId);
	}

	/**
	 * 查询固定小组.
	 * ＜p＞按照id查询某一固定小组的信息（包括成员）<br>
	 *
	 * @param groupId 小组的id
	 * @return List 固定小组成员列表对象，若未找到相关成员返回空(null)
	 * @throws IllegalArgumentException        信息不合法，id格式错误
	 * @author YeHongjie
	 * @see FixGroupService #listFixGroupMemberByGroupId(BigInteger groupId)
	 */
	public List<FixGroupMember> listFixGroupByGroupId(BigInteger groupId) throws
			IllegalArgumentException, FixGroupNotFoundException {
		List<FixGroupMember> fixGroupMemberList= fixGroupMapper.listFixGroupByGroupId(groupId);
		return fixGroupMemberList;
	}

	/**
	 * 将学生加入小组.
	 * ＜p＞将用户加入指定的小组<br>
	 *
	 * @param userId  学生的id
	 * @param groupId 要加入小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 * @throws IllegalArgumentException  信息不合法，id格式错误
	 * @throws FixGroupNotFoundException 未找到小组
	 * @throws ClassesNotFoundException 未找到班级
	 * @throws UserNotFoundException     不存在该学生
	 * @throws InvalidOperationException 待添加学生已经在小组里了
	 * @author YeHongjie
	 */

	public BigInteger insertStudentIntoGroup(BigInteger userId, BigInteger groupId) throws
			IllegalArgumentException, FixGroupNotFoundException, UserNotFoundException,ClassesNotFoundException,
			InvalidOperationException{
		FixGroupMember fixGroupMember=new FixGroupMember();
		fixGroupMapper.insertStudnetIntoGroup(userId,groupId,fixGroupMember);
		BigInteger fixGroupMemberId=fixGroupMember.getId();
		return fixGroupMemberId;
	}
	/**
	 * 将固定小组作为讨论课小组名单.
	 *
	 * @param semianrId    讨论课ID
	 * @param fixedGroupId 小组ID
	 * @throws IllegalArgumentException  信息不合法，id格式错误
	 * @throws FixGroupNotFoundException 未找到小组
	 * @throws SeminarNotFoundException  未找到讨论课
	 * @author qinlingyun
	 */
	public void fixedGroupToSeminarGroup(BigInteger semianrId, BigInteger fixedGroupId) throws
			IllegalArgumentException, FixGroupNotFoundException, SeminarNotFoundException{
		List<FixGroup> fixGroupList=fixGroupMapper.listClassIdAndLeaderIdByFixedGroupId(fixedGroupId);
		BigInteger classId=fixGroupList.get(0).getClassInfo().getId();
		BigInteger leaderId=fixGroupList.get(0).getLeader().getId();
		SeminarGroup seminarGroup=new SeminarGroup();
		fixGroupMapper.insertSeminarGroupBySeminarIdAndLeaderId(semianrId,classId,leaderId,seminarGroup);
		BigInteger seminarGroupId=seminarGroup.getId();
		List<BigInteger> studentIdList=fixGroupMapper.listStudentIdByFixGroupId(fixedGroupId);
		Map<BigInteger,BigInteger> mapList=new HashMap<>();
		for(int i=0;i<studentIdList.size();i++){
			mapList.put(studentIdList.get(i),seminarGroupId);
			System.out.println("studentId="+studentIdList.get(i));
		}
		Map<String,Map<BigInteger,BigInteger>> maps = new HashMap<>();
		maps.put("maps",mapList);
		fixGroupMapper.insertSeminarGroupMemberBySeminarGroupId(maps);
	}
}
