package coursemanagesystem.service.impl;

import coursemanagesystem.entity.User;
import coursemanagesystem.service.LoginService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class LoginServiceImpl implements LoginService {
    public User signInWeChat(BigInteger userId, String code,
                             String state, String successUrl){
        User user=new User();
        return user;
    }

    public User signInPhone(User user){
        return user;
    }
}
