package coursemanagesystem.mapper;

import course.bo.ProportionsBO;

import java.math.BigInteger;

public interface ScoreRuleMapper {
    boolean deleteScoreRuleById(BigInteger courseId, BigInteger classId);
    BigInteger insertScoreRule(ProportionsBO proportionsBO);
    Boolean updateScoreRule(BigInteger proportionId, ProportionsBO proportionsBO);
    Boolean deleteScoreRule(BigInteger proportionId);
    ProportionsBO getScoreRule(BigInteger proportionId);
}
