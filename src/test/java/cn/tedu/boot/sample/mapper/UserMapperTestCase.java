package cn.tedu.boot.sample.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.boot.sample.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void addnew() {
		User user = new User();
		user.setUsername("boot");
		user.setPassword("8888");
		Integer rows = userMapper.addnew(user);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void findByUsername() {
		String username = "boot";
		User user
			= userMapper.findByUsername(username);
		System.err.println(user);
	}

}








