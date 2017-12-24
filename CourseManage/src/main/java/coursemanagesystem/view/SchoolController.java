package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {
	@RequestMapping(value="/school",method=GET)
	public String get_school() {
		return null;
	}

	@RequestMapping(value="/school",method=POST)
	public String post_school() {
		return null;
	}
}
