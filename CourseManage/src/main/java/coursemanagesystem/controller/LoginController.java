package coursemanagesystem.controller;

import coursemanagesystem.entity.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class LoginController {
    @RequestMapping(value="/home",method=GET)
    public String login() {
        return "common/home.html";
    }
    @RequestMapping(value="/wechat",method=GET)
    public String wechatlogin() {
        return "common/wechat.html";
    }
    @RequestMapping(value="/register",method=GET)
    public String getregister() {
        return "common/register.html";
    }
    @RequestMapping(value="/teacher",method=GET)
    public String getteacher() {
        return "teacher/course.html";
    }
    @RequestMapping(value="/signin",method=POST)
    @ResponseBody
    public ResponseEntity getSignin(@RequestParam(value = "phone", required = false) String phone,
                                    @RequestParam(value = "password", required = false) String password) {
        System.out.println("phone="+phone+",password="+password);
        User user=new User();
        user.setPhone(phone);
        user.setPassword(password);
        return ResponseEntity.status(200).contentType(MediaType.APPLICATION_JSON_UTF8).body(user);
        //return ResponseEntity.status(404).build();
    }
}
