package coursemanagesystem.mapper;

import course.bo.AttendanceBO;
import course.bo.UserBO;

import java.math.BigInteger;
import java.util.List;

public interface UserMapper {
    boolean insertAttendanceById(BigInteger classId, BigInteger seminarId, BigInteger userId, double longitude, double latitude);
    List<AttendanceBO> listAttendanceById(BigInteger classId);
    UserBO signUpPhone(UserBO user);
    UserBO signInWeChat(BigInteger userId, String code, String state, String successUrl);
    UserBO signInPhone(UserBO user);
    boolean deleteTeacherAccount(BigInteger userId);
    boolean deleteStudentAccount(BigInteger userId);
    UserBO getUserByUserId(BigInteger userId);
    BigInteger getUserIdByUserName(String userName);
    boolean updateUserByUserId(BigInteger userId, UserBO user);
    List<UserBO> listUserByClassId(BigInteger classId, String numBeginWith, String nameBeginWith);
    List<UserBO> listUserByUserName(String userName);
    List<UserBO> listPresentStudent(BigInteger seminarId, BigInteger classId);
    List<UserBO> listAbsenceStudent(BigInteger seminarId, BigInteger classId);
}
