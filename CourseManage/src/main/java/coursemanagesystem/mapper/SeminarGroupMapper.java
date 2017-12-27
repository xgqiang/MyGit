package coursemanagesystem.mapper;

import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.SeminarGroupMember;
import coursemanagesystem.entity.Topic;
import coursemanagesystem.entity.User;
import coursemanagesystem.exception.*;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.security.acl.Group;
import java.util.List;

public interface SeminarGroupMapper {
    void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) throws
            IllegalArgumentException;
    void deleteSeminarGroupMemberBySeminarId(BigInteger seminarId) throws
            IllegalArgumentException;
    Long insertSeminarGroupMemberById(@Param("userId") BigInteger userId, @Param("groupId") BigInteger groupId,
                                            @Param("seminarGroupMember")SeminarGroupMember seminarGroupMember) throws
            IllegalArgumentException,GroupNotFoundException,
            UserNotFoundException,InvalidOperationException;
    List<User> listSeminarGroupMemberByGroupId(BigInteger groupId) throws
            IllegalArgumentException,GroupNotFoundException;
    List<SeminarGroup> listSeminarGroupIdByStudentId(BigInteger userId) throws
            IllegalArgumentException;
    BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId) throws
            IllegalArgumentException,GroupNotFoundException;
    List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId) throws
            IllegalArgumentException,SeminarNotFoundException;
    void deleteSeminarGroupBySeminarId(BigInteger seminarId) throws
            IllegalArgumentException;
    Long insertSeminarGroupMemberByGroupId(@Param("seminarId")BigInteger seminarId,
                                           @Param("seminarGroupMember")SeminarGroupMember seminarGroupMember) throws
            IllegalArgumentException;
    Long insertSeminarGroupBySeminarId(@Param("seminarId")BigInteger seminarId,@Param("classId") BigInteger classId,
                                             @Param("seminarGroup")SeminarGroup seminarGroup) throws
            IllegalArgumentException;
    void deleteSeminarGroupByGroupId(BigInteger groupId) throws
            IllegalArgumentException;
    void deleteSeminarGroupMemberById(@Param("seminarGroupId") BigInteger seminarGroupId,
                                      @Param("userId") BigInteger userId) throws
            IllegalArgumentException;
    SeminarGroup getSeminarGroupByGroupId(BigInteger groupId) throws
            IllegalArgumentException,GroupNotFoundException;
    BigInteger getSeminarGroupLeaderById(@Param("userId")BigInteger userId,
                                         @Param("seminarId")BigInteger seminarId) throws
            IllegalArgumentException;
    Long insertTopicByGroupId(@Param("groupId")BigInteger groupId,
                                    @Param("topicId")BigInteger topicId,@Param("topic")Topic topic) throws
            IllegalArgumentException,GroupNotFoundException;
    void assignLeaderById(@Param("groupId")BigInteger groupId,
                          @Param("userId")BigInteger userId) throws
            IllegalArgumentException,GroupNotFoundException,
            UserNotFoundException,InvalidOperationException;
    void resignLeaderById(@Param("groupId") BigInteger groupId,
                          @Param("userId") BigInteger userId) throws
            IllegalArgumentException,GroupNotFoundException;
    SeminarGroup getSeminarGroupById(@Param("seminarId") BigInteger seminarId,
                                     @Param("userId") BigInteger userId) throws
            IllegalArgumentException,GroupNotFoundException;
    List<SeminarGroup> listGroupByTopicId(BigInteger topicId) throws
            IllegalArgumentException;

    List<BigInteger> listAttendedStudentByClassIdAndSeminarId(@Param("seminarId") BigInteger seminarId,
                                                        @Param("classId") BigInteger classId) throws
            IllegalArgumentException;

    List<BigInteger> listHaveChooseTopic(@Param("allSeminarGroupList")List<SeminarGroup> allSeminarGroupList) throws
            IllegalArgumentException;
}
