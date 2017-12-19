package coursemanagesystem.mapper;

import java.math.BigInteger;
import java.util.List;

public interface GradeMapper {
    boolean deleteStudentScoreGroupByTopicId(BigInteger topicId);
    List<BigInteger> listSeminarGradeBySeminarGroupId(BigInteger userId, BigInteger seminarGroupId);
    boolean insertGroupGradeByUserId(BigInteger userId, BigInteger seminarId, BigInteger groupId, BigInteger grade);
    boolean updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade);
    List<BigInteger> listSeminarGradeByStudentId(BigInteger userId);
}
