package coursemanagesystem.mapper;

import coursemanagesystem.entity.Topic;

import java.math.BigInteger;
import java.util.List;

public interface TopicMapper {
    Topic getTopicByTopicId(BigInteger topicId);
    void updateTopicByTopicId(BigInteger topicId, Topic topic);
    void deleteTopicByTopicId(BigInteger topicId, BigInteger seminarId);
    List<Topic> listTopicBySeminarId(BigInteger seminarId);
    BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic);
    void deleteTopicById(BigInteger groupId, BigInteger topicId);
    void deleteSeminarGroupTopicByTopicId(BigInteger topicId);
    void deleteTopicBySeminarId(BigInteger seminarId);
}
