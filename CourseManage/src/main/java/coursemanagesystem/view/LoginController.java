package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import coursemanagesystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {
	/*@Autowired
	LoginServiceImpl loginservice=new LoginServiceImpl();
	@RequestMapping(value="/home",method=GET)
	public String login() {
		return "home";
	}
	@RequestMapping(value="/wechat",method=GET)
	public String wechatlogin() {
		return "wechat";
	}
	@RequestMapping(value="/register",method=GET)
	public String getregister() {
		return "register";
	}
		
	@RequestMapping(value="/register",method=POST)
	public String postregister(@RequestParam("phone") String phone,@RequestParam("password") String password,
			@RequestParam("name") String name,@RequestParam("school") String school,
			@RequestParam("gender") String gender,@RequestParam("type") String type,
			@RequestParam("number") String number,@RequestParam("email") String email,Model model) {
		User user=new User();
		user.setEmail(email);
		user.setGender(gender);
		user.setName(name);
		user.setSchool(school);
		user.setNumber(number);
		user.setPhone(phone);
		user.setType(type);
		user.setPassword(password);
		loginservice.saveUser(user);
		return "home";
	}
	
	@RequestMapping(value="/signin",method=POST)
	public String loginCheck(@RequestParam("phone") String phone,@RequestParam("password") String password,Model model) {

		if(loginservice.findId(phone)==null) {
			ErrorMessage error=new ErrorMessage("登录错误","未注册！");
			errorservice.saveError(error);
			ErrorMessage currentError=errorservice.findOne(error.getName());
			model.addAttribute("errormessage",currentError);
			return "/message";
		}
		else {
			User user=loginservice.findUser(loginservice.findId(phone));
			if(password.equals(user.getPassword())) {
				if(user.getType().equals("teacher")) {
					model.addAttribute("User",user);
					return "/teacher";
				} else if(user.getType().equals("student")) {
					model.addAttribute("User",user);
					return "/student";
				}
			}
			else {
				ErrorMessage error=new ErrorMessage("登录错误","手机密码错误！");
				errorservice.saveError(error);
				ErrorMessage currentError=errorservice.findOne(error.getName());
				model.addAttribute("errormessage",currentError);
				return "/message";
			}
		}
		return "/error";
	}
	@RequestMapping(value="/select/{courseId}",method=GET)
	public String student_select_course(@PathVariable String courseId, Model model) {
		courseService.saveSelectCourse(Integer.valueOf(courseId));
		model.addAttribute("CourseList", courseService.getAllSelectCourses());
		return "/student/course";
	}*/
}
