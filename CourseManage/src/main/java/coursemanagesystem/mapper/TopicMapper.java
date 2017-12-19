package coursemanagesystem.mapper;

import course.bo.TopicBO;

import java.math.BigInteger;
import java.util.List;

public interface TopicMapper {
    TopicBO getTopicByTopicId(BigInteger topicId);
    boolean updateTopicByTopicId(BigInteger topicId, TopicBO topic);
    boolean deleteTopicByTopicId(BigInteger topicId, BigInteger seminarId);
    List<TopicBO> listTopicBySeminarId(BigInteger seminarId);
    BigInteger insertTopicBySeminarId(BigInteger seminarId, TopicBO topic);
    boolean deleteTopicById(BigInteger groupId, BigInteger topicId);
    boolean deleteSeminarGroupTopicByTopicId(BigInteger topicId);
    boolean deleteTopicBySeminarId(BigInteger seminarId);
}
