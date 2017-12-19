package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {
	@RequestMapping(value="{topicId}",method=GET)
	public String get_topic_message() {
		return "/student/course/group/message";
	}
	@RequestMapping(value="{topicId}",method=PUT)
	public String put_topic_message() {
		return "/student/course/group/message";
	}
	@RequestMapping(value="{topicId}",method=DELETE)
	public String delete_topic_message() {
		return "/student/course/group/message";
	}
	
	@RequestMapping(value="/change",method=GET)
	public String change_topic_message() {
		return "/teacher/course/seminar/topic/change";
	}
}
