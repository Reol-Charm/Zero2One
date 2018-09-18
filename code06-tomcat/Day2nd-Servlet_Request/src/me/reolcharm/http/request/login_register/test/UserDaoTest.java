package me.reolcharm.http.request.login_register.test;

import me.reolcharm.http.request.login_register.dao.UserDao;
import me.reolcharm.http.request.login_register.domain.User;
import org.junit.Test;

public class UserDaoTest {



    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("superbaby");
        loginuser.setPassword("123111");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
