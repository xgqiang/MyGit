package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {
	@RequestMapping(method=GET)
	public String get_school() {
		return "/student/course/group/message";
	}
	@RequestMapping(method=POST)
	public String delete_school() {
		return "/student/course/group/message";
	}
}
