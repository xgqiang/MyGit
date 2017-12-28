package coursemanagesystem.service.impl;

import coursemanagesystem.entity.SeminarGroupTopic;
import coursemanagesystem.entity.Topic;
import coursemanagesystem.exception.TopicNotFoundException;
import coursemanagesystem.mapper.TopicMapper;
import coursemanagesystem.service.GradeService;
import coursemanagesystem.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.List;

public class TopicServiceImpl implements TopicService {
    private final
    TopicMapper topicMapper;

    final
    GradeService gradeService;

    // todo clear here
    @Autowired(required = false)
    public TopicServiceImpl(TopicMapper topicMapper, GradeService gradeService) {
        GradeService gradeService1;
        this.topicMapper = topicMapper;
        gradeService1 = gradeService;
        this.gradeService = gradeService1;
    }

    @Override
    public Topic getTopicByTopicId(BigInteger topicId) throws TopicNotFoundException, IllegalArgumentException {
        if (topicId == null) {
            throw new IllegalArgumentException("id should be null");
        }

        Topic t = topicMapper.getTopicById(topicId);
        if (t == null) {
            throw new TopicNotFoundException("topic没找到");
        }
        return t;
    }

    @Override
    public void updateTopicByTopicId(BigInteger topicId, Topic topic) throws TopicNotFoundException, IllegalArgumentException {
        if (topicId == null || topic == null) {
            throw new IllegalArgumentException();
        }

        Topic oriTopic = getTopicByTopicId(topicId);

        if (oriTopic == null) {
            throw new TopicNotFoundException("topic没找到");
        }

        if (topic.getSeminar() != null) {
            oriTopic.setSeminar(topic.getSeminar());
        }

        if (topic.getName() != null) {
            oriTopic.setName(topic.getName());
        }

        if (topic.getDescription() != null) {
            oriTopic.setDescription(topic.getDescription());
        }

        if (topic.getGroupNumberLimit() != null) {
            oriTopic.setGroupNumberLimit(topic.getGroupNumberLimit());
        }

        if (topic.getGroupStudentLimit() != null) {
            oriTopic.setGroupStudentLimit(topic.getGroupStudentLimit());
        }

        try {
            topicMapper.updateTopic(oriTopic);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
        if (topicId == null) {
            throw new IllegalArgumentException();
        }

        try {
            topicMapper.deleteById(topicId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Topic> listTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
        if (seminarId == null) {
            throw new IllegalArgumentException();
        }

        List<Topic> topics = topicMapper.getTopicsBySeminarId(seminarId);
        return topics;
    }

    @Override
    public BigInteger insertTopicBySeminarId(BigInteger seminarId, Topic topic) throws IllegalArgumentException {
        if (seminarId == null || topic == null) {
            throw new IllegalArgumentException();
        }

        long inserted = topicMapper.insertWithSeminarId(seminarId, topic);
        return BigInteger.valueOf(inserted);
    }

    @Override
    @NotNull
    public void deleteSeminarGroupTopicById(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException {
        if (groupId == null || topicId == null) {
            throw new IllegalArgumentException();
        }

        topicMapper.deleteSeminarGroupTopic(groupId, topicId);
    }

    @Override
    public void deleteSeminarGroupTopicByTopicId(BigInteger topicId) throws IllegalArgumentException {
        if (topicId == null) {
            throw new IllegalArgumentException();
        }

        topicMapper.deleteAllSeminarGroupTopicsByTopicId(topicId);
    }

    @Override
    public SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId) throws IllegalArgumentException {
        if (groupId == null || topicId == null) {
            throw new IllegalArgumentException();
        }

        return topicMapper.getTopicInfoOfGroup(topicId, groupId);
    }

    @Override
    public List<SeminarGroupTopic> listSeminarGroupTopicByGroupId(BigInteger groupId) throws IllegalArgumentException {
        if (groupId == null) {
            throw new IllegalArgumentException();
        }

        return topicMapper.getChosenTopicByGroupId(groupId);
    }

    @Override
    public void deleteTopicBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
        if (seminarId == null) {
            throw new IllegalArgumentException();
        }

        List<Topic> topics = topicMapper.getTopicsBySeminarId(seminarId);
        topics.forEach(topic -> {
            List<SeminarGroupTopic> seminarGroupTopics = topicMapper.getSeminarGroupTopicsByTopicId(topic.getId());
            seminarGroupTopics.forEach(seminarGroupTopic -> {
                gradeService.deleteStudentScoreGroupByTopicId(seminarGroupTopic.getId());
                topicMapper.deleteChosenTopicByGroupId(seminarGroupTopic.getSeminarGroup().getId());
            });
        });

        topicMapper.deleteTopicsBySeminarId(seminarId);
    }
}
