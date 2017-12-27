package coursemanagesystem.restController;

import coursemanagesystem.entity.Course;
import coursemanagesystem.entity.Seminar;
import coursemanagesystem.exception.SeminarNotFoundException;
import coursemanagesystem.service.impl.SeminarGroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
@RestController
public class SeminarRestController {
    @Autowired
    private SeminarGroupServiceImpl seminarGroupService;

    @GetMapping("/course/{courseId}/seminar")
    public ResponseEntity<String> getSeminarByCourseId(@PathVariable("courseId")BigInteger courseId){

        List classList = new ArrayList<Course>();
        Course courses = new Course();
        courses.setId(courseId);
        classList.add(courses);
        String message = "讨论课的详情列表";
        return new ResponseEntity<>(message, HttpStatus.valueOf(200));
    }

    @PostMapping("/course/{courseId}/seminar")
    public ResponseEntity<String> putSeminarByCourseId(@PathVariable("courseId")BigInteger courseId){
        List classList = new ArrayList<Course>();
        Course courses = new Course();
        courses.setId(courseId);
        classList.add(courses);
        String message = "成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(201));
    }

    @GetMapping("/seminar/{seminarId}")
    public ResponseEntity<List> getSeminarById(@PathVariable("seminarId")BigInteger seminarId){
        try{
            List classList =seminarGroupService.listSeminarGroupBySeminarId(seminarId);
            return new ResponseEntity<>(classList, HttpStatus.valueOf(200));
        }
        catch (SeminarNotFoundException e){
            String message = "讨论课没有找到";
            return new ResponseEntity<>( HttpStatus.valueOf(404));
        }
		/*List classList = new ArrayList<Seminar>();
		Seminar seminars = new Seminar();
		seminars.setId(seminarId);
		classList.add(seminars);
		String message = "讨论课详情";
		return new ResponseEntity<>(classList, HttpStatus.valueOf(200));*/
    }

    @PutMapping("/seminar/{seminarId}")
    public ResponseEntity<String> putSeminarById(@PathVariable("seminarId")BigInteger seminarId){
        List classList = new ArrayList<Seminar>();
        Seminar seminars = new Seminar();
        seminars.setId(seminarId);
        classList.add(seminars);
        String message = "成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(204));
    }

    @DeleteMapping("/seminar/{seminarId}")
    public ResponseEntity<String> deleteSeminarById(@PathVariable("seminarId")BigInteger seminarId){
        try{
            seminarGroupService.deleteSeminarGroupBySeminarId(seminarId);
            String message = "删除成功";
            return new ResponseEntity<>(message, HttpStatus.valueOf(200));
        }
        catch(Exception e){
            e.printStackTrace();
            String message = "删除失败";
            return new ResponseEntity<>(message, HttpStatus.valueOf(404));
        }
    }

    @GetMapping("/seminar/{seminarId}/grade")
    public ResponseEntity<String> getGradeBySeminarId(@PathVariable("seminarId")BigInteger seminarId){
        List classList = new ArrayList<Seminar>();
        Seminar seminars = new Seminar();
        seminars.setId(seminarId);
        classList.add(seminars);
        String message = "成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(200));
    }

    @PutMapping("/seminar/{seminarId}/grade")
    public ResponseEntity<String> putGradeBySeminarId(@PathVariable("seminarId")BigInteger seminarId){
        List classList = new ArrayList<Seminar>();
        Seminar seminars = new Seminar();
        seminars.setId(seminarId);
        classList.add(seminars);
        String message = "成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(204));
    }

    @PutMapping("/seminar/{seminarId}/grade/{studentId}")
    public ResponseEntity<String> putGradeByStudentId(@PathVariable("seminarId")BigInteger seminarId,@PathVariable("studentId")int studentId){
        List classList = new ArrayList<Seminar>();
        Seminar seminars = new Seminar();
        seminars.setId(seminarId);
        classList.add(seminars);
        String message = "成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(204));
    }
}
