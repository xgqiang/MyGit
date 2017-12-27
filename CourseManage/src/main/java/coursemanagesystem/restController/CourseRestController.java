package coursemanagesystem.restController;

import coursemanagesystem.entity.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseRestController {
    @GetMapping("course")
    public ResponseEntity<List> getCourse(HttpServletRequest request){
        List classList = new ArrayList<Course>();
        Course courses = new Course();
        classList.add(courses);
        return new ResponseEntity<>(classList, HttpStatus.valueOf(200));
    }

    @PostMapping("course")
    public ResponseEntity<List> postCourse(HttpServletRequest request){
        List classList = new ArrayList<Course>();
        Course courses = new Course();
        classList.add(courses);
        return new ResponseEntity<>(classList, HttpStatus.valueOf(200));
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List> getCourseById(@PathVariable("courseid")int courseid) {
        List classList = new ArrayList<Course>();
        Course courses = new Course();
        classList.add(courses);
        return new ResponseEntity<>(classList, HttpStatus.valueOf(200));
    }


    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<String> deleteCourseById(@PathVariable("courseid")int courseid) {
        List classList = new ArrayList<Course>();
        Course courses = new Course();
        classList.add(courses);
        String message="删除成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(200));
    }
}
