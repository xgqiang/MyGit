package course.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import course.service.SeminarService;

@Controller
@RequestMapping("/seminar")
public class SeminarController {
	@Autowired
	SeminarService seminarService = new SeminarService();
	
	@RequestMapping(value="/manage",method=GET)
	public String get_seminar_manage(@RequestParam("seminarId") String seminarId,@RequestParam("type") String type,
			Model model) {
		model.addAttribute("Seminar", seminarService.findOne(Integer.valueOf(seminarId)));
		return "/teacher/course/seminar/manage";
	}
	
	@RequestMapping(value="/{seminarId}",method=GET)
	public String get_seminar_message(@PathVariable String seminarId,@RequestParam("type") String type,
			Model model) {
		model.addAttribute("Seminar", seminarService.findOne(Integer.valueOf(seminarId)));
		if(type.equals("teacher")) {
			return "/teacher/course/seminar/manage";
		} else if(type.equals("student")) {
			return "/student/course/seminar/message";
		} else {
			return "error";
		}
	}
	@RequestMapping(value="{seminarId}/change",method=GET)
	public String get_seminar_change(@PathVariable String seminarId,Model model) {
		model.addAttribute("Seminar", seminarService.findOne(Integer.valueOf(seminarId)));
		return "/teacher/course/seminar/change";
	}
	@RequestMapping(value="{seminarId}",method=PUT)
	public String put_seminar_message() {
		return "/teacher/course/seminar/manage";
	}
	@RequestMapping(value="{seminarId}",method=DELETE)
	public String delete_seminar_message() {
		return "/teacher/course/seminar/manage";
	}
	@RequestMapping(value="{seminarId}/grade",method=GET)
	public String get_seminar_grade(@RequestParam("type") String type) {
		if(type.equals("teacher")) {
			return "/teacher/course/seminar/grade";
		} else if(type.equals("student")) {
			return "/student/course/group/score";
		} else {
			return "error";
		}
	}
	@RequestMapping(value="{seminarId}/grade",method=PUT)
	public String put_seminar_grade() {
		return "/teacher/course/seminar/manage";
	}
	@RequestMapping(value="{seminarId}/grade/{studentId}",method=PUT)
	public String put_seminar_grade_others() {
		return "/teacher/course/seminar/manage";
	}
	@RequestMapping(value="{seminarId}/topic",method=GET)
	public String get_seminar_topic() {
		return "/teacher/course/seminar/topic/beforeclass";
	}
	@RequestMapping(value="{seminarId}/buildtopic",method=GET)
	public String build_seminar_topic() {
		return "/teacher/course/seminar/buildtopic";
	}
	@RequestMapping(value="{seminarId}/topic",method=POST)
	public String post_seminar_topic() {
		return "/teacher/course/seminar/manage";
	}
	@RequestMapping(value="{seminarId}/group",method=GET)
	public String get_seminar_group() {
		return "/teacher/course/seminar/manage";
	}
}
