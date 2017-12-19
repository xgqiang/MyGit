package coursemanagesystem.mapper;

import course.bo.GroupBO;
import course.bo.SeminarBO;

import java.math.BigInteger;
import java.util.List;

public interface SeminarMapper {
    List<SeminarBO> listSeminarByCourseId(BigInteger courseId);
    boolean deleteSeminarByCourseId(BigInteger courseId);
    SeminarBO getMySeminarBySeminarId(BigInteger seminarId, BigInteger userId);
    SeminarBO getSeminarDetailBySeminarId(BigInteger seminarId, BigInteger userId);
    SeminarBO getSeminarBySeminarId(BigInteger seminarId);
    boolean updateSeminarBySeminarId(BigInteger seminarId, SeminarBO seminar);
    boolean deleteSeminarBySeminarId(BigInteger seminarId);
    BigInteger insertSeminarByCourseId(BigInteger courseId, SeminarBO seminarBO);
    List<GroupBO> listGroupBySeminarId(BigInteger seminarId);
    List<GroupBO> listGroupByTopicId(BigInteger topicId);
    GroupBO getSeminarGroupById(BigInteger seminarId, BigInteger userId);
    BigInteger updateSeminarGroupById(BigInteger groupId, GroupBO group);
    boolean automaticallyGrouping(BigInteger seminarId, BigInteger classId);
    BigInteger insertStudnetIntoGroup(BigInteger userId, BigInteger groupId);
    String insertTopicByGroupId(BigInteger groupId, BigInteger topicId);
}
