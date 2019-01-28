package cn.tedu.boot.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.boot.sample.entity.User;
import cn.tedu.boot.sample.service.IUserService;
import cn.tedu.boot.sample.util.ResponseResult;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@PostMapping("/reg")
	public ResponseResult<Void> handleReg(User user) {
		System.err.println("1"+user.getUsername());
		// 执行注册
		userService.reg(user);
		// 注册成功，确定返回值
		return new ResponseResult<>(1, "注册成功！");
	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseResult<Void> handleException(Exception e) {
		System.out.println(2);
		return new ResponseResult<>(2, e);
	}
}
