package coursemanagesystem.mapper;

import coursemanagesystem.entity.ClassInfo;

import java.math.BigInteger;
import java.util.List;

public interface ClassMapper {
    void deleteClassSelectionByClassId(BigInteger classId);
    List<ClassInfo> listClassByName(String courseName, String teacherName);
    List<ClassInfo> listClassByCourseName(String courseName);
    List<ClassInfo> listClassByTeacherName(String teacherName);
    List<ClassInfo> listClassByUserId(BigInteger userId);
    List<ClassInfo> listClassByCourseId(BigInteger courseId);
    ClassInfo getClassByClassId(BigInteger classId);
    void updateClassByClassId(BigInteger classId);
    void deleteClassByClassId(BigInteger classId);
    String insertCourseSelectionById(BigInteger userId, BigInteger classId);
    void deleteCourseSelectionById(BigInteger userId, BigInteger classId);
    ClassInfo getCallGroupStatusById(BigInteger seminarId);
    ClassInfo insertClassById(BigInteger userId, BigInteger courseId);
    void deleteClassByCourseId(BigInteger courseId);
}
