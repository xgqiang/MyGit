package coursemanagesystem.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import coursemanagesystem.entity.School;
import coursemanagesystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping(value="/home",method=GET)
	public String login() {
		return "index";
	}
	/*@RequestMapping(value="/wechat",method=GET)
	public String wechatlogin() {
		return "wechat";
	}
	/*@RequestMapping(value="/register",method=GET)
	public String getregister() {
		return "register";
	}
	@RequestMapping(value="/signin",method=GET)
	public String getsigin() {
		return "teacher";
	}*/

}
