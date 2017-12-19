package coursemanagesystem.mapper;

import coursemanagesystem.entity.Course;

import java.math.BigInteger;
import java.util.List;

public interface CourseMapper {
    List<Course> listCourseByUserId(BigInteger userId);
    BigInteger insertCourseByUserId(BigInteger userId, Course course);
    Course getCourseByCourseId(BigInteger courseId);
    boolean updateCourseByCourseId(BigInteger courseId, Course course);
    boolean deleteCourseByCourseId(BigInteger courseId);
    List<Course> listCourseByCourseName(String courseName);
    List<Course> listCourseByTeacherName(String teacherName);
}
