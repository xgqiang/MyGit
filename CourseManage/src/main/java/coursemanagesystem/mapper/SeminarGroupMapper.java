package coursemanagesystem.mapper;

import course.bo.GroupBO;
import course.bo.SeminarGroupBO;
import course.bo.UserBO;

import java.math.BigInteger;
import java.util.List;

public interface SeminarGroupMapper {
    boolean deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId);
    BigInteger insertSeminarGroupMemberById(BigInteger userId, BigInteger groupId);
    List<UserBO> listSeminarGroupMemberByGroupId(BigInteger groupId);
    List<BigInteger> listSeminarGroupIdByStudentId(BigInteger userId);
    BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId);
    List<SeminarGroupBO> listSeminarGroupBySeminarId(BigInteger seminarId);
    boolean deleteSeminarGroupBySeminarId(BigInteger seminarId);
    BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId, SeminarGroupBO seminarGroupBO);
    Boolean deleteSeminarGroupByGroupId(BigInteger groupId);
    SeminarGroupBO getSeminarGroupByGroupId(BigInteger groupId);
    BigInteger getSeminarGroupById1(BigInteger userId, BigInteger seminarId);
    BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId);
    BigInteger insertStudnetIntoGroup(BigInteger userId, BigInteger groupId);
    Boolean automaticallyGrouping(BigInteger seminarId, BigInteger classId);
    BigInteger updateSeminarGroupById(BigInteger groupId, GroupBO group);
    GroupBO getSeminarGroupById(BigInteger seminarId, BigInteger userId);
    List<GroupBO> listGroupBySeminarId(BigInteger seminarId);
    List<GroupBO> listGroupByTopicId(BigInteger topicId);
}
