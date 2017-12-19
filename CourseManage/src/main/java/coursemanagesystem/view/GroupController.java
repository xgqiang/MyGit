package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {
	@RequestMapping(value="{groupId}",method=GET)
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
	}
}
