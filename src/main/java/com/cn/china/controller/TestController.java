package com.cn.china.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//测试提交
@Controller
public class TestController {
	
	@RequestMapping
	public String test(){
		return "hello";
	}

}
