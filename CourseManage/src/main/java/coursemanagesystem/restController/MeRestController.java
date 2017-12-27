package coursemanagesystem.restController;

import coursemanagesystem.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MeRestController {
    /*@GetMapping("/me")
    public ResponseEntity<List> getMe(){
        List classList = new ArrayList<User>();
        User users=new User();
        classList.add(users);
        return new ResponseEntity<>(classList, HttpStatus.valueOf(200));
    }

    @PutMapping("/me")
    public ResponseEntity<List> putMe() {
        List classList = new ArrayList<User>();
        User users = new User();
        classList.add(users);
        String message="操作成功";
        return new ResponseEntity<>(classList, HttpStatus.valueOf(204));
    }*/

    @GetMapping("/signin")
    public ResponseEntity<List> getSignin() {
        List classList = new ArrayList<User>();
        User users=new User();
        classList.add(users);
        return new ResponseEntity<>(classList, HttpStatus.valueOf(200));
    }
    /*@PostMapping("/signin")
    public ResponseEntity<String> postSignin() {
        List classList = new ArrayList<User>();
        User users=new User();
        classList.add(users);
        String message = "登录成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(200));
    }
    @PostMapping("/register")
    public ResponseEntity<String> postRegister(@PathVariable("phone")String phone,@PathVariable("password")String password,Model model){
        List classList = new ArrayList<User>();
        User users = new User();
        String message = "注册成功";
        return new ResponseEntity<>(message, HttpStatus.valueOf(200));
    }*/
}
