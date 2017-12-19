package coursemanagesystem.mapper;

import coursemanagesystem.entity.ClassInfo;

import java.math.BigInteger;
import java.util.List;

public interface ClassMapper {
    boolean deleteClassSelectionByClassId(BigInteger classId);
    List<ClassInfo> listClassByName(String courseName, String teacherName);
    List<ClassInfo> listClassByCourseName(String courseName);
    List<ClassInfo> listClassByTeacherName(String teacherName);
    List<ClassInfo> listClassByUserId(BigInteger userId);
    List<ClassInfo> listClassByCourseId(BigInteger courseId);
    ClassInfo getClassByClassId(BigInteger classId);
    boolean updateClassByClassId(BigInteger classId);
    boolean deleteClassByClassId(BigInteger classId);
    String insertCourseSelectionById(BigInteger userId, BigInteger classId);
    boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId);
    ClassInfo getCallGroupStatusById(BigInteger seminarId);
    ClassInfo insertClassById(BigInteger userId, BigInteger courseId);
    boolean deleteClassByCourseId(BigInteger courseId);
}
