package coursemanagesystem.view;

import coursemanagesystem.entity.FixGroup;
import coursemanagesystem.entity.SeminarGroup;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@Controller
@RequestMapping("/group")
public class GroupController {
	/*@RequestMapping(value="{groupId}",method=GET)
	public String get_group_message() {
		return "/student/course/group/message";
	}
	@RequestMapping(value="{groupId}",method=PUT)
	public String put_group_message() {
		return "/student/course/group/message";
	}

	@RequestMapping(value="/message",method=GET)
	public String student_get_group_message() {
		return "/student/course/group/message";
	}

	@RequestMapping(value="/change",method=GET)
	public String student_change_group_message() {
		return "/student/course/group/change";
	}*/
}
