package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import course.entity.Course;
import course.entity.ErrorMessage;
import course.entity.Proportion;
import course.service.CourseService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService courseService = new CourseService();
	Random rand = new Random(34);
	
	/*@RequestMapping(value="/teacher/course/manage",method=GET)
	public String get_teacher_course_message() {
		return "/teacher/course/manage";
	}
	@RequestMapping(value="/teacher/course/change",method=GET)
	public String change_course_message() {
		return "/teacher/course/change";
	}
	@RequestMapping(value="/student/course/message",method=GET)
	public String get_student_course_message() {
		return "/student/course/message";
	}
	@RequestMapping(value="/teacher/course",method=GET)
	public String get_teacher_course() {
		return "/teacher/course";
	}
	@RequestMapping(value="/teacher/course/buildclass",method=GET)
	public String build_class() {
		return "/teacher/course/buildclass";
	}
	@RequestMapping(value="/teacher/course/buildseminar",method=GET)
	public String build_seminar() {
		return "/teacher/course/buildseminar";
	}
	@RequestMapping(value="/student/course",method=GET)
	public String get_student_course() {
		return "/student/course";
	}
	@RequestMapping(value="/student/course/choose",method=GET)
	public String select_seminar() {
		return "/student/course/choose";
	}
	@RequestMapping(value="/student/course/seminar1",method=GET)
	public String seminar_message() {
		return "/student/course/seminar/message";
	}*/
	@RequestMapping(value="/select/{courseId}",method=GET)
	public String student_select_course(@PathVariable String courseId,Model model) {
		courseService.saveSelectCourse(Integer.valueOf(courseId));
		model.addAttribute("CourseList", courseService.getAllSelectCourses());
		return "/student/course";
	}
	
	
	@RequestMapping(value="/create",method=GET)
	public String get_create_course(Model model) {
		return "/teacher/build";
	}
	@RequestMapping(value="/change",method=GET)
	public String get_change_course(@RequestParam("id") String id,Model model) {
		System.out.println("changeId="+id);
		model.addAttribute("Course", courseService.findOne(Integer.valueOf(id)));
		System.out.println("changeId1="+id);
		return "/teacher/course/change";
	}
	@RequestMapping(value="/select",method=GET)
	public String get_select_course(@RequestParam("id") String id,Model model) {
		courseService.saveSelectCourse(Integer.valueOf(id));
		model.addAttribute("CourseList", courseService.getAllSelectCourses());
		return "/student/course";
	}
	
	@RequestMapping(value="/create",method=POST)
	public String post_create_course(@RequestParam("numClass") int numClass,@RequestParam("numStudent") int numStudent,@RequestParam("name") String name,
			@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime,@RequestParam("description") String description,
			@RequestParam("presentation") String presentation,@RequestParam("report") String report,
			@RequestParam("a") String a,@RequestParam("b") String b,@RequestParam("c") String c,Model model) {
		Course course=new Course();
		Proportion proportion=new Proportion(Integer.parseInt(c),Integer.parseInt(c),Integer.parseInt(c),
				Integer.parseInt(report),Integer.parseInt(presentation));
		course.setEndTime(endTime);
		course.setName(name);
		course.setNumClass(numClass);
		course.setNumStudent(numStudent);
		course.setStartTime(startTime);
		course.setProportions(proportion);
		course.setDescription(description);
		model.addAttribute(course);
		courseService.saveCourse(course);
		return "redirect:/course?type=teacher";
	}
	
	
	@RequestMapping(method=GET)
	public String get_course(@RequestParam("type") String type,Model model) {
		if(type.equals("student")) {
			model.addAttribute("CourseList", courseService.getAllSelectCourses());
			return "/student/course";
		} else if(type.equals("teacher")) {
			model.addAttribute("CourseList", courseService.getAllCourses());
			return "/teacher/course";
		} else {
			ErrorMessage error=new ErrorMessage("登录错误","未登陆！");
			model.addAttribute("errormessage",error);
			return "/message";
		}
	}
	@RequestMapping(value="/delete",method=DELETE)
	public String delete_course(@RequestParam("id") String id,@RequestParam("type") String type,Model model) {
		System.out.println("delete_id="+id);
		if(type.equals("student")) {
			courseService.deleteSelectCourse(Integer.valueOf(id));
			model.addAttribute("CourseList", courseService.getAllSelectCourses());
			return "/student/course";
		}
		courseService.deleteCourse(Integer.valueOf(id));
		model.addAttribute("CourseList", courseService.getAllCourses());
		return "/teacher/course";
	}
	
	@RequestMapping(value="/{courseId}",method=DELETE)
	public String teacher_delete_course(@PathVariable String courseId,Model model) {
		System.out.println("delete_id="+courseId);
		courseService.deleteCourse(Integer.valueOf(courseId));
		model.addAttribute("CourseList", courseService.getAllCourses());
		return "/teacher/course";
	}
	
	@RequestMapping(value="/update/{courseId}",method=PUT)
	public String change_course(@PathVariable String courseId,@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime,
			@RequestParam("description") String description,@RequestParam("name") String name,
			@RequestParam("a") String a,@RequestParam("b") String b,@RequestParam("c") String c,Model model) {
		System.out.println("change_id="+courseId);
		Course course=courseService.findOne(Integer.valueOf(courseId));
		course.setName(name);
		course.setStartTime(startTime);
		course.setEndTime(endTime);
		course.setDescription(description);
		course.getProportions().setA(Integer.valueOf(a));
		course.getProportions().setB(Integer.valueOf(b));
		course.getProportions().setB(Integer.valueOf(c));
		//courseService.saveCourse(course);
		return "/course?type=teacher";
	}
}
