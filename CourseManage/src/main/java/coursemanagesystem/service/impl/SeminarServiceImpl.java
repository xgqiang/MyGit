package coursemanagesystem.service.impl;

import coursemanagesystem.entity.Course;
import coursemanagesystem.entity.Seminar;
import coursemanagesystem.exception.CourseNotFoundException;
import coursemanagesystem.exception.SeminarNotFoundException;
import coursemanagesystem.mapper.SeminarMapper;
import coursemanagesystem.service.SeminarService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;
import java.util.List;

public class SeminarServiceImpl implements SeminarService {
    // todo deleted later
    @Autowired(required = false)
    SeminarMapper seminarMapper;


    @Override
    public List<Seminar> listSeminarByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        if (seminarMapper.getCourseById(courseId) == null) {
            throw new CourseNotFoundException("未找到相应的课程！");
        }
        return seminarMapper.listSeminarByCourseId(courseId);
    }


    @Override
    public void deleteSeminarByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        if (seminarMapper.getCourseById(courseId) == null) {
            throw new CourseNotFoundException("未找到相应的课程！");
        }

        List<Seminar> seminars = listSeminarByCourseId(courseId);
        for (int i = 0; i < seminars.size(); i++) {
            seminarMapper.deleteTopicBySeminarId(seminars.get(i).getId());
            seminarMapper.deleteSeminarGroupBySeminarId(seminars.get(i).getId());
        }

        seminarMapper.deleteSeminarByCourseId(courseId);

    }


    @Override
    public Seminar getSeminarBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {
        if (seminarMapper.getSeminarBySeminarId(seminarId) == null) {
            throw new SeminarNotFoundException("未找到相应的讨论课！");
        }
        return seminarMapper.getSeminarBySeminarId(seminarId);
    }

    @Override
    public void updateSeminarBySeminarId(BigInteger seminarId, Seminar seminar) throws IllegalArgumentException, SeminarNotFoundException {
        if (seminarMapper.getSeminarBySeminarId(seminarId) == null) {
            throw new SeminarNotFoundException("未找到相应的讨论课！");
        }
        seminar.setId(seminarId);
        seminarMapper.updateSeminarBySeminarId(seminar);
    }

    @Override
    public void deleteSeminarBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {
        if (seminarMapper.getSeminarBySeminarId(seminarId) == null) {
            throw new SeminarNotFoundException("未找到相应的讨论课！");
        }
        //删除讨论课包含的topic信息和小组信息
        seminarMapper.deleteTopicBySeminarId(seminarId);
        seminarMapper.deleteSeminarGroupBySeminarId(seminarId);
        //通过seminarId删除讨论课
        seminarMapper.deleteSeminarBySeminarId(seminarId);
    }

    @Override
    public BigInteger insertSeminarByCourseId(BigInteger courseId, Seminar seminar) throws IllegalArgumentException, CourseNotFoundException {
        if (seminarMapper.getCourseById(courseId) == null) {
            throw new CourseNotFoundException("未找到相应的课程！");
        }
        Course course = new Course();
        course.setId(courseId);
        seminar.setCourse(course);
        return seminarMapper.insertSeminarByCourseId(seminar);
    }
}
