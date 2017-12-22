package coursemanagesystem.mapper;

import coursemanagesystem.entity.Attendance;
import coursemanagesystem.entity.User;

import java.math.BigInteger;
import java.util.List;

public interface UserMapper {
    void insertAttendanceById(BigInteger classId, BigInteger seminarId, BigInteger userId, double longitude, double latitude);
    List<Attendance> listAttendanceById(BigInteger classId);
    User signUpPhone(User user);
    User signInWeChat(BigInteger userId, String code, String state, String successUrl);
    User signInPhone(User user);
    void deleteTeacherAccount(BigInteger userId);
    void deleteStudentAccount(BigInteger userId);
    User getUserByUserId(BigInteger userId);
    BigInteger getUserIdByUserName(String userName);
    void updateUserByUserId(BigInteger userId, User user);
    List<User> listUserByClassId(BigInteger classId, String numBeginWith, String nameBeginWith);
    List<User> listUserByUserName(String userName);
    List<User> listPresentStudent(BigInteger seminarId, BigInteger classId);
    List<User> listAbsenceStudent(BigInteger seminarId, BigInteger classId);
}
