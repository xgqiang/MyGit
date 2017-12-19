package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
public class UploadController {
	@RequestMapping(value="avatar",method=POST)
	public String post_avatar() {
		return "/student/course/group/message";
	}
	@RequestMapping(value="classroster",method=POST)
	public String post_classroster() {
		return "/student/course/group/message";
	}
}
