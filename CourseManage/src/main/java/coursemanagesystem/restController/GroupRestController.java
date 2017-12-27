package coursemanagesystem.restController;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.SeminarGroup;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GroupRestController {
    @GetMapping("/group/{groupId}")
    public ResponseEntity<FixGroup> getFixGroupByGroupId(@PathVariable BigInteger groupId) {
        FixGroup fixGroup=new FixGroup();
        return new ResponseEntity<>(fixGroup, HttpStatus.valueOf(200));
    }

    @PutMapping("/group/{groupId}")
    public ResponseEntity<String> updateTopicByGroupId(@PathVariable BigInteger groupId) {
        String message="操作成功";
        return new ResponseEntity<>(message,HttpStatus.valueOf(204));
    }

    @GetMapping("/topic/{topicId}/group")
    public ResponseEntity<List> listGroupByTopicId(@PathVariable BigInteger topicId){
        List groupList = new ArrayList<SeminarGroup>();
        return new ResponseEntity<>(groupList, HttpStatus.OK);
    }

    @GetMapping("/seminar/{seminarId}/group")
    public ResponseEntity<FixGroup> getFixGroupById(@PathVariable BigInteger topicId,@PathVariable BigInteger studentId){
        FixGroup fixGroup=new FixGroup();
        return new ResponseEntity<>(fixGroup, HttpStatus.valueOf(200));
    }

    @DeleteMapping("/topic/{topicId}/group/{groupId}")
    public ResponseEntity<String> deleteFixGroupByGroupId(@PathVariable BigInteger topicId,@PathVariable BigInteger groupId){
        String message="删除失败";
        return new ResponseEntity<>(message, HttpStatus.valueOf(404));
    }

    @PostMapping("/topic/{topicId}/group")
    public ResponseEntity<String> insertTopicByGroupId(@PathVariable BigInteger topicId){
        String url="/topic/"+topicId+"/group/";
        return new ResponseEntity<>(url, HttpStatus.OK);
    }
}
