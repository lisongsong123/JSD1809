package cn.tedu.boot.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	// 请求路径：/hello/index
	@GetMapping("/index")
	public String showIndex() {
		return "hello, spring boot.";
	}

}






