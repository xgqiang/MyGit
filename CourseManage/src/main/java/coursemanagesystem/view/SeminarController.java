package coursemanagesystem.view;

import coursemanagesystem.entity.Course;
import coursemanagesystem.entity.Seminar;
import coursemanagesystem.exception.SeminarNotFoundException;
import coursemanagesystem.service.impl.SeminarGroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class SeminarController {
	//@Autowired
	//SeminarServiceImpl seminarService = new SeminarServiceImpl();

	/*@RequestMapping(value="/manage",method=GET)
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
	}*/
	/*@RequestMapping(value="{seminarId}",method=PUT)
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
	}*/

}
