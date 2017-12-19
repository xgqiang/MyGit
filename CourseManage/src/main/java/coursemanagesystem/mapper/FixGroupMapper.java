package coursemanagesystem.mapper;

import course.bo.FixGroupBO;
import course.bo.GroupBO;
import course.bo.UserBO;
import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.User;

import java.math.BigInteger;
import java.util.List;

public interface FixGroupMapper {
    boolean deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId);
    BigInteger insertFixGroupMemberById(BigInteger userId, BigInteger groupId);
    List<User> listFixGroupMemberByGroupId(BigInteger groupId);
    List<FixGroup> listFixGroupByClassId(BigInteger classId);
    boolean deleteFixGroupByClassId(BigInteger classId);
    BigInteger insertFixGroupByClassId(BigInteger classId, FixGroup fixGroupBO);
    Boolean deleteFixGroupByGroupId(BigInteger groupId);
    Boolean updateFixGroupByGroupId(BigInteger groupId, FixGroup fixGroupBO);
    FixGroup getFixGroupByGroupId(BigInteger groupId);
    BigInteger insertStudnetIntoGroup(BigInteger userId, BigInteger groupId);
    boolean deleteTopicByGroupId(BigInteger groupId);
    GroupBO getFixedGroupById(BigInteger userId, BigInteger classId);
    String insertTopicByGroupId(BigInteger groupId, BigInteger topicId);
    BigInteger updateSeminarGroupById(BigInteger groupId, GroupBO group);
}
