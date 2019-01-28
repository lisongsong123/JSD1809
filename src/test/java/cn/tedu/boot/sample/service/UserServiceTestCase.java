package cn.tedu.boot.sample.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.boot.sample.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {

	@Autowired
	IUserService userService;
	
	@Test
	public void reg() {
		try {
			User user = new User();
			user.setUsername("service");
			user.setPassword("8866");
			userService.reg(user);
			System.err.println("注册成功！");
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
	
}








