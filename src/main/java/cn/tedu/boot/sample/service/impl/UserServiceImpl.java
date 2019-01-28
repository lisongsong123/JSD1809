package cn.tedu.boot.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.boot.sample.entity.User;
import cn.tedu.boot.sample.mapper.UserMapper;
import cn.tedu.boot.sample.service.IUserService;

@Service
public class UserServiceImpl
	implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void reg(User user) {
		// 根据user.getUsername()查询数据
		String username = user.getUsername();
		User data = userMapper.findByUsername(username);
		// 判断数据是否为null
		if (data == null) {
			// 是：为null，即：用户名未被使用，则插入数据
			userMapper.addnew(user);
		} else {
			// 否：非null，即：用户名被占用，则抛出异常
			throw new RuntimeException(
				"注册失败！您尝试注册的用户名(" + username + ")已经被占用！");
		}
	}

}




