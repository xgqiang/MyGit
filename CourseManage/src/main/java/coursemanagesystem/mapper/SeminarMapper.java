package coursemanagesystem.mapper;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.Seminar;

import java.math.BigInteger;
import java.util.List;

public interface SeminarMapper {
    List<Seminar> listSeminarByCourseId(BigInteger courseId);
    void deleteSeminarByCourseId(BigInteger courseId);
    Seminar getMySeminarBySeminarId(BigInteger seminarId, BigInteger userId);
    Seminar getSeminarDetailBySeminarId(BigInteger seminarId, BigInteger userId);
    Seminar getSeminarBySeminarId(BigInteger seminarId);
    void updateSeminarBySeminarId(BigInteger seminarId, Seminar seminar);
    void deleteSeminarBySeminarId(BigInteger seminarId);
    BigInteger insertSeminarByCourseId(BigInteger courseId, Seminar seminarBO);
    List<FixGroup> listGroupBySeminarId(BigInteger seminarId);
    List<FixGroup> listGroupByTopicId(BigInteger topicId);
    FixGroup getSeminarGroupById(BigInteger seminarId, BigInteger userId);
    BigInteger updateSeminarGroupById(BigInteger groupId, FixGroup group);
    void automaticallyGrouping(BigInteger seminarId, BigInteger classId);
    BigInteger insertStudnetIntoGroup(BigInteger userId, BigInteger groupId);
    String insertTopicByGroupId(BigInteger groupId, BigInteger topicId);
}
