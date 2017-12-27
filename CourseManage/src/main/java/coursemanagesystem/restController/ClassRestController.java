package coursemanagesystem.restController;

import coursemanagesystem.entity.Attendance;
import coursemanagesystem.entity.ClassInfo;
import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ClassRestController {
    @GetMapping("/course/{courseId}/class")
    public ResponseEntity<List> listClassByCourseId(@PathVariable BigInteger courseId) {
        List classList=new ArrayList<ClassInfo>();
        ClassInfo aclass=new ClassInfo();
        aclass.getCourse().setId(courseId);
        ClassInfo bclass=new ClassInfo();
        classList.add(aclass);
        classList.add(bclass);
        return new ResponseEntity<>(classList, HttpStatus.OK);
    }
    @PostMapping("/course/{courseId}/class")
    public ResponseEntity<String> postClassByCourseId(@PathVariable BigInteger courseId,
                                                      @RequestBody ClassInfo aclass) {
        String message="操作成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(200));
    }
    @GetMapping("/class")
    public ResponseEntity<List> listClassByUser() {
        List classList=new ArrayList<ClassInfo>();
        ClassInfo aclass=new ClassInfo();
        aclass.setName("中文班");
        ClassInfo bclass=new ClassInfo();
        bclass.setName("英文班");
        classList.add(aclass);
        classList.add(bclass);
        return new ResponseEntity<>(classList, HttpStatus.OK);
    }
    @GetMapping("/class/{classId}")
    public ResponseEntity<ClassInfo> listClassByClassId(@PathVariable BigInteger classId) {
        ClassInfo aclass=new ClassInfo();
        aclass.setId(classId);
        return new ResponseEntity<>(aclass, HttpStatus.OK);
    }
    @PutMapping("/class/{classId}")
    public ResponseEntity<ClassInfo> putClassByClassId(@PathVariable BigInteger classId) {
        ClassInfo aclass=new ClassInfo();
        aclass.setId(classId);
        return new ResponseEntity<>(aclass, HttpStatus.OK);
    }
    @DeleteMapping("/class/{classId}")
    public ResponseEntity<String> deleteClassByClassId(@PathVariable BigInteger classId) {
        String message="删除失败";
        return new ResponseEntity<>(message, HttpStatus.valueOf(404));
    }

    @GetMapping("/class/{classId}/student")
    public ResponseEntity<List> listStudentByClassId(@PathVariable BigInteger classId) {
        List listStudent=new ArrayList<User>();
        User aUser=new User();
        User bUser=new User();
        listStudent.add(aUser);
        listStudent.add(bUser);
        return new ResponseEntity<>(listStudent, HttpStatus.OK);
    }
    @PostMapping("/class/{classId}/student")
    public ResponseEntity<String> postStudentByClassId(@PathVariable BigInteger classId) {
        String url="/class/"+classId+"/student/2757";
        return new ResponseEntity<>(url, HttpStatus.OK);
    }

    @DeleteMapping("/class/{classId}/student/{studentId}")
    public ResponseEntity<String> deleteClassByStudentId(@PathVariable BigInteger classId,
                                                         @PathVariable BigInteger studentId) {
        String url="/class/"+classId+"/student/"+studentId;
        return new ResponseEntity<>(url, HttpStatus.OK);
    }
    @GetMapping("/class/{classId}/attendance")
    public ResponseEntity<List> listAttendanceByClassId(@PathVariable BigInteger classId) {
        List listAttendance=new ArrayList<Attendance>();
        Attendance attendance1=new Attendance();
        Attendance attendance2=new Attendance();
        listAttendance.add(attendance1);
        listAttendance.add(attendance2);
        return new ResponseEntity<>(listAttendance, HttpStatus.OK);
    }

    @PutMapping("/class/{classId}/attendance/{studentId}")
    public ResponseEntity<List> postAttendanceByClassIdAndStudentId(@PathVariable BigInteger classId,
                                                                    @PathVariable BigInteger studentId) {
        List listAttendance=new ArrayList<Attendance>();
        Attendance attendance1=new Attendance();
        Attendance attendance2=new Attendance();
        listAttendance.add(attendance1);
        listAttendance.add(attendance2);
        return new ResponseEntity<>(listAttendance, HttpStatus.OK);
    }
    @GetMapping("/class/{classId}/classgroup")
    public ResponseEntity<List> listGroupByClassId(@PathVariable BigInteger classId) {
        List listClassGroup=new ArrayList<FixGroup>();
        FixGroup fixGroup1=new FixGroup();
        FixGroup fixGroup2=new FixGroup();
        listClassGroup.add(fixGroup1);
        listClassGroup.add(fixGroup2);
        return new ResponseEntity<>(listClassGroup, HttpStatus.OK);
    }
    @PutMapping("/class/{classId}/classgroup")
    public ResponseEntity<List> putGroupByClassId(@PathVariable BigInteger classId) {
        List listClassGroup=new ArrayList<FixGroup>();
        FixGroup fixGroup1=new FixGroup();
        FixGroup fixGroup2=new FixGroup();
        listClassGroup.add(fixGroup1);
        listClassGroup.add(fixGroup2);
        return new ResponseEntity<>(listClassGroup, HttpStatus.OK);
    }
}
