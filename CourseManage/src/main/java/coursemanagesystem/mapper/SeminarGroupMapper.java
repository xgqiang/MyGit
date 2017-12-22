package coursemanagesystem.mapper;

import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.entity.SeminarGroupMember;
import coursemanagesystem.entity.User;

import java.math.BigInteger;
import java.security.acl.Group;
import java.util.List;

public interface SeminarGroupMapper {
    void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId);
    BigInteger insertSeminarGroupMemberById(BigInteger userId, BigInteger groupId);
    List<User> listSeminarGroupMemberByGroupId(BigInteger groupId);
    List<SeminarGroup> listSeminarGroupIdByStudentId(BigInteger userId);
    BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId);
    List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId);
    void deleteSeminarGroupBySeminarId(BigInteger seminarId);
    BigInteger insertSeminarGroupMemberByGroupId(BigInteger seminarId, SeminarGroupMember seminarGroupMember);
    BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId, SeminarGroup seminarGroup);
    void deleteSeminarGroupByGroupId(BigInteger groupId);
    SeminarGroup getSeminarGroupByGroupId(BigInteger groupId);
    //BigInteger getSeminarGroupById1(BigInteger userId, BigInteger seminarId);
    BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId);
    //BigInteger insertStudnetIntoGroup(BigInteger userId, BigInteger groupId);
    BigInteger insertTopicByGroupId(BigInteger groupId, BigInteger topicId);
   // void automaticallyGrouping(BigInteger seminarId, BigInteger classId);
    void assignLeaderById(BigInteger groupId,BigInteger userId);
    void resignLeaderById(BigInteger groupId,BigInteger userId);
    //BigInteger updateSeminarGroupById(BigInteger groupId, Group group);
    SeminarGroup getSeminarGroupById(BigInteger seminarId, BigInteger userId);
   // List<SeminarGroup> listGroupBySeminarId(BigInteger seminarId);
    List<SeminarGroup> listGroupByTopicId(BigInteger topicId);
}
