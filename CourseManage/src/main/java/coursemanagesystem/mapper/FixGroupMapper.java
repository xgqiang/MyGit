package coursemanagesystem.mapper;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.FixGroupMember;
import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.*;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public interface FixGroupMapper {
    void deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    List<User> listFixGroupMemberByGroupId(BigInteger groupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    List<FixGroup> listFixGroupByClassId(BigInteger classId)throws
            IllegalArgumentException;
    List<BigInteger> listStudentIdByFixGroupId(BigInteger fixGroupId)throws
            IllegalArgumentException;
    void deleteFixGroupByClassId(BigInteger classId)throws
            IllegalArgumentException,ClassesNotFoundException;

    Long insertFixGroupByClassId(@Param("classId") BigInteger classId, @Param("userId") BigInteger userId,
                                 @Param("fixGroup") FixGroup fixGroup)throws
            IllegalArgumentException,UserNotFoundException;

    void deleteFixGroupByGroupId(BigInteger groupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    void updateFixGroupByGroupId(@Param("groupId") BigInteger groupId, @Param("fixGroup") FixGroup fixGroup)throws
            IllegalArgumentException,FixGroupNotFoundException;

    void insertSeminarGroupMemberBySeminarGroupId(Map<String,Map<BigInteger,BigInteger>> maps)throws
            IllegalArgumentException,FixGroupNotFoundException;

    List<FixGroupMember> listFixGroupByGroupId(BigInteger groupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    Long insertStudnetIntoGroup(@Param("userId") BigInteger userId, @Param("groupId") BigInteger groupId,
                                @Param("fixGroupMember") FixGroupMember fixGroupMember)throws
            IllegalArgumentException,FixGroupNotFoundException,
            InvalidOperationException,UserNotFoundException;


    void deleteFixGroupUserById(@Param("fixGroupId") BigInteger fixGroupId,@Param("userId") BigInteger userId) throws
            IllegalArgumentException, FixGroupNotFoundException, UserNotFoundException;

    FixGroup getFixedGroupById(@Param("userId") BigInteger userId, @Param("classId") BigInteger classId)throws
            IllegalArgumentException,ClassesNotFoundException,UserNotFoundException;

    List<FixGroup> listClassIdAndLeaderIdByFixedGroupId(BigInteger fixedGroupId) throws
            IllegalArgumentException, FixGroupNotFoundException;
    Long insertSeminarGroupBySeminarIdAndLeaderId(@Param("seminarId") BigInteger seminarId,@Param("classId") BigInteger classId,
                                                  @Param("leaderId") BigInteger leaderId, @Param("seminarGroup") SeminarGroup seminarGroup) throws
            IllegalArgumentException, FixGroupNotFoundException;
}
