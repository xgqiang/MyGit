package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import course.service.impl.ClassServiceImpl;
import course.service.impl.SeminarServiceImpl;
import coursemanagesystem.service.impl.ClassServiceImpl;
import coursemanagesystem.service.impl.SeminarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import course.entity.Proportion;
import course.entity.Seminar;
import course.entity.Class;
import course.entity.ClassTime;
import course.service.ClassService;
import course.service.SeminarService;


@RestController
@RequestMapping("/class")
public class ClassController {
	@Autowired
	ClassServiceImpl classService=new ClassServiceImpl();
	@Autowired
	SeminarServiceImpl seminarService=new SeminarServiceImpl();
	@RequestMapping(value="/classes",method=GET)
	public String class12_message(@RequestParam("classId") String classId, Model model) {
		Class aclass=classService.findOne(Integer.valueOf(classId));
		model.addAttribute("Class",aclass);
		return "/teacher/course/class/class";
	}
	@RequestMapping(value="/change",method=GET)
	public String class_change(@RequestParam("classId") String classId, Model model) {
		Class aclass=classService.findOne(Integer.valueOf(classId));
		model.addAttribute("Class",aclass);
		return "/teacher/course/class/change";
	}
	@RequestMapping(value="/update",method=PUT)
	public String put_update_class(@RequestParam("classId") String classId,@RequestParam("name") String name,@RequestParam("site") String site,
			@RequestParam("week") String week,@RequestParam("day") String day,@RequestParam("lesson") String lesson,
			@RequestParam("presentation") String presentation,@RequestParam("report") String report,
			@RequestParam("a") String a,@RequestParam("b") String b,@RequestParam("c") String c,Model model) {
		classService.deleteClass(Integer.valueOf(classId));
		Proportion proportion=new Proportion(Integer.parseInt(c),Integer.parseInt(c),Integer.parseInt(c),
				Integer.parseInt(report),Integer.parseInt(presentation));
		ClassTime timeSite=new ClassTime(week,Integer.parseInt(day),Integer.parseInt(lesson),site);
		Class aclass=new Class();
		aclass.setName(name);
		aclass.setProportions(proportion);
		aclass.setTimeSite(timeSite);
		classService.saveClass(aclass);
		model.addAttribute("ClassList",classService.getAllClasses());
		model.addAttribute("SeminarList",seminarService.getAllSeminars());
		return "redirect:/class?type=teacher";
	}
	@RequestMapping(value="/create",method=GET)
	public String get_create_class() {
		return "/teacher/course/buildclass";
	}
	@RequestMapping(value="/create",method=POST)
	public String post_create_class(@RequestParam("name") String name,@RequestParam("site") String site,
			@RequestParam("week") String week,@RequestParam("day") String day,@RequestParam("lesson") String lesson,
			@RequestParam("presentation") String presentation,@RequestParam("report") String report,
			@RequestParam("a") String a,@RequestParam("b") String b,@RequestParam("c") String c,Model model) {
		Proportion proportion=new Proportion(Integer.parseInt(c),Integer.parseInt(c),Integer.parseInt(c),
				Integer.parseInt(report),Integer.parseInt(presentation));
		ClassTime timeSite=new ClassTime(week,Integer.parseInt(day),Integer.parseInt(lesson),site);
		Class aclass=new Class();
		aclass.setName(name);
		aclass.setProportions(proportion);
		aclass.setTimeSite(timeSite);
		classService.saveClass(aclass);
		model.addAttribute("ClassList",classService.getAllClasses());
		model.addAttribute("SeminarList",seminarService.getAllSeminars());
		System.out.println("创建班级成功");
		return "redirect:/class?type=teacher";
	}
	@RequestMapping(value="/seminar/create",method=GET)
	public String get_create_seminar() {
		return "/teacher/course/buildseminar";
	}
	@RequestMapping(value="/seminar/create",method=POST)
	public String post_create_seminar(@RequestParam("name") String name,@RequestParam("description") String description,
			@RequestParam("groupingMethod") String groupingMethod,@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime,
			@RequestParam("presentation") String presentation,@RequestParam("report") String report,
			@RequestParam("a") String a,@RequestParam("b") String b,@RequestParam("c") String c,Model model) {
		Proportion proportion=new Proportion(Integer.parseInt(c),Integer.parseInt(c),Integer.parseInt(c),
				Integer.parseInt(report),Integer.parseInt(presentation));
		Seminar seminar=new Seminar();
		seminar.setName(name);
		seminar.setDescription(description);
		seminar.setStartTime(startTime);
		seminar.setEndTime(endTime);
		seminar.setGroupingMethod(groupingMethod);
		seminar.setProportions(proportion);
		seminarService.saveSeminar(seminar);
		model.addAttribute("ClassList",classService.getAllClasses());
		model.addAttribute("SeminarList",seminarService.getAllSeminars());
		return "redirect:/class?type=teacher";
	}
	@RequestMapping(method=GET)
	public String get_class(@RequestParam("type") String type,Model model) {
		model.addAttribute("ClassList",classService.getAllClasses());
		model.addAttribute("SeminarList",seminarService.getAllSeminars());
		if(type.equals("teacher")) {			
			return "/teacher/course/manage";
		} else if(type.equals("student")) {
			return "/student/course/choose";
		}
		return "/#";
	}
	
	
}
