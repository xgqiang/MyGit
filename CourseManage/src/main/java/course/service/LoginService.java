package course.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import course.entity.User;


@Service
public class LoginService {
	User User=new User();
	List<User> users = new ArrayList<User>();
	Map<Integer, User> MapUsers = new HashMap<Integer, User>();//通过用户id获取用户信息
	Map<String, Integer> MapPhones=new HashMap<String, Integer>();//通过手机号获取用户id
	Random rand = new Random(36);
	public LoginService() {
		
	}
	public void saveUser(User user) {
		if(user.getId()!=null) {
			users.add(user);
			MapUsers.put(user.getId(), user);
			MapPhones.put(user.getPhone(), user.getId());
		}
		else {
			Integer id = (int)-1;
			while (id < 0 ){
				id = rand.nextInt(1000);
			}
			user.setId(id);
			users.add(user);
			MapUsers.put(id, user);
			MapPhones.put(user.getPhone(), id);
		}
		
	}
	public Integer findId(String phone) {
		return MapPhones.get(phone);
	}
	public User findUser(Integer id) {
		User=MapUsers.get(id);
		return MapUsers.get(id);
	}
	public User getNowUser() {
		return User;
	}
}
