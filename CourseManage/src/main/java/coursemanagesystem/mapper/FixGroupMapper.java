package coursemanagesystem.mapper;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.FixGroupMember;
import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.ClassesNotFoundException;
import coursemanagesystem.exception.FixGroupNotFoundException;
import coursemanagesystem.exception.InvalidOperationException;
import coursemanagesystem.exception.UserNotFoundException;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface FixGroupMapper {
    void deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    List<User> listFixGroupMemberByGroupId(BigInteger groupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    List<FixGroup> listFixGroupByClassId(BigInteger classId)throws
            IllegalArgumentException;

    void deleteFixGroupByClassId(BigInteger classId)throws
            IllegalArgumentException,ClassesNotFoundException;

    Long insertFixGroupByClassId(@Param("classId") BigInteger classId, @Param("userId") BigInteger userId,
                                 @Param("fixGroup") FixGroup fixGroup)throws
            IllegalArgumentException,ClassesNotFoundException;

    void deleteFixGroupByGroupId(BigInteger groupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    void updateFixGroupByGroupId(@Param("groupId") BigInteger groupId, @Param("fixGroup") FixGroup fixGroup)throws
            IllegalArgumentException,FixGroupNotFoundException;

    List<FixGroupMember> getFixGroupByGroupId(BigInteger groupId)throws
            IllegalArgumentException,FixGroupNotFoundException;

    Long insertStudnetIntoGroup(@Param("userId") BigInteger userId, @Param("groupId") BigInteger groupId,
                                @Param("fixGroupMember") FixGroupMember fixGroupMember)throws
            IllegalArgumentException,FixGroupNotFoundException,
            InvalidOperationException,UserNotFoundException;

    void deleteTopicByGroupId(BigInteger groupId)throws
            FixGroupNotFoundException,IllegalArgumentException;

    FixGroup getFixedGroupById(@Param("userId") BigInteger userId, @Param("classId") BigInteger classId)throws
            IllegalArgumentException,ClassesNotFoundException,UserNotFoundException;

    void updateSeminarGroupById(@Param("groupId") BigInteger groupId, @Param("group") SeminarGroup group)throws
            IllegalArgumentException,FixGroupNotFoundException;

    void fixedGroupToSeminarGroup(@Param("semianrId") BigInteger semianrId,@Param("fixedGroupId") BigInteger fixedGroupId);
}
