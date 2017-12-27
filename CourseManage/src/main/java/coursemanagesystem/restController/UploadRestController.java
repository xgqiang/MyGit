package coursemanagesystem.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadRestController {
    @PostMapping("avatar")
    public ResponseEntity<String> postAvatar() {
        String message = "服务器上的头像文件URL";
        return new ResponseEntity<>(message, HttpStatus.valueOf(201));
    }
    @RequestMapping(value="classroster",method= RequestMethod.POST)
    public ResponseEntity<String> postClassroster() {
        String message = "服务器上的学生名单文件URL";
        return new ResponseEntity<>(message, HttpStatus.valueOf(201));
    }
}
