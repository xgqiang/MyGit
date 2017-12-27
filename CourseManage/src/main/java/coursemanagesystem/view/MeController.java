package coursemanagesystem.view;

import coursemanagesystem.entity.School;
import coursemanagesystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MeController {

    /*@Autowired
	LoginService loginService=new LoginService();
	@Autowired
	UserServiceImpl userService=new UserServiceImpl();
	@RequestMapping(method=GET)
	public String get_me_message(@RequestParam("type") String type,Model model) {
		model.addAttribute("User",loginService.getNowUser());
		if(type.equals("teacher")) {
			return "/teacher/message";
		} else {
			return "/student/message";
		}
	}
	@RequestMapping(value="/change",method=GET)
	public String get_change_message(@RequestParam("type") String type,Model model) {
		model.addAttribute("User",loginService.getNowUser());
		if(type.equals("teacher")) {
			return "/teacher/change";
		} else {
			return "/student/change";
		}
	}
	@RequestMapping(method=POST)
	public String put_me_message(@RequestParam("type") String type,@RequestParam("id") String id,
			@RequestParam("number") String number,@RequestParam("name") String name,@RequestParam("phone") String phone,
			@RequestParam("email") String email,@RequestParam("gender") String gender,@RequestParam("school") String school,
			Model model) {
		User User=loginService.findUser(Integer.valueOf(id));
		User.setEmail(email);
		User.setGender(gender);
		User.setId(Integer.valueOf(id));
		User.setName(name);
		User.setNumber(number);
		User.setPhone(phone);
		User.setSchool(school);
		User.setType(type);
		model.addAttribute("User",loginService.getNowUser());
		return "redirect:/me?type="+type;
	}*/
}
