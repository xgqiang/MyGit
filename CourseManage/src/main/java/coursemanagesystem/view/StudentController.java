package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	/*@Autowired
	CourseService courseService = new CourseService();
	@Autowired
	ClassService classService = new ClassService();
	
	@RequestMapping(method=GET)
	public String courseTest() {
		return "student";
	}
	@RequestMapping(value="/message",method=GET)
	public String getMessage() {
		return "/student/message";
	}
	@RequestMapping(value="/change",method=GET)
	public String messageChange() {
		return "/student/change";
	}
	
	@RequestMapping(value="/select",method=GET)
	public String selectCourse(Model model) {
		model.addAttribute("CourseList", courseService.getAllCourses());
		model.addAttribute("ClassList", classService.getAllClasses());
		return "/student/select";
	}
	@RequestMapping(value="/course",method=GET)
	public String chooseCourse(Model model) {
		model.addAttribute("CourseList", courseService.getAllSelectCourses());
		return "/student/course";
	}*/
	
}
