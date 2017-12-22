package coursemanagesystem.mapper;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.User;

import java.math.BigInteger;
import java.util.List;

public interface FixGroupMapper {
    void deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId);
    BigInteger insertFixGroupMemberById(BigInteger userId, BigInteger groupId);
    List<User> listFixGroupMemberByGroupId(BigInteger groupId);
    List<FixGroup> listFixGroupByClassId(BigInteger classId);
    void deleteFixGroupByClassId(BigInteger classId);
    BigInteger insertFixGroupByClassId(BigInteger classId, FixGroup fixGroupBO);
    void deleteFixGroupByGroupId(BigInteger groupId);
    void updateFixGroupByGroupId(BigInteger groupId, FixGroup fixGroupBO);
    FixGroup getFixGroupByGroupId(BigInteger groupId);
    BigInteger insertStudnetIntoGroup(BigInteger userId, BigInteger groupId);
    void deleteTopicByGroupId(BigInteger groupId);
    FixGroup getFixedGroupById(BigInteger userId, BigInteger classId);
    String insertTopicByGroupId(BigInteger groupId, BigInteger topicId);
    BigInteger updateSeminarGroupById(BigInteger groupId, FixGroup group);
}
