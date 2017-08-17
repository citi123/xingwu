package com.city.xingwu.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.city.xingwu.domain.Student;
import com.city.xingwu.service.test.TestService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
public class TestController {

	@Resource
	private TestService testService;

	@ApiOperation(value = "测试一", notes = "hello测试")
	@RequestMapping(path = "/one", method = RequestMethod.GET)
	public String testOne(String name) {
		return "hello , " + name;
	}

	@ApiOperation(value = "测试二", notes = "返回Map")
	@RequestMapping(path = "/two", method = RequestMethod.GET)
	public Map<String, Object> testTwo() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "city");
		map.put("address", "上海");
		return map;
	}

	@ApiOperation(value = "测试三", notes = "获取当前时间")
	@RequestMapping(path = "now", method = RequestMethod.GET)
	public String testThree() {
		return testService.getCurrentTime();
	}
	
	@ApiOperation(value = "测试四", notes = "获取用户")
	@RequestMapping(path = "/four", method = RequestMethod.GET)
	public Student testFour(Student student){
		Student stu = new Student();
		stu.setId(1L);
		stu.setAddress("北京");
		stu.setBirthday(new Date());
		stu.setGender("男");
		stu.setHobbies("篮球、美女");
		stu.setName("张三");
		return stu;
	}
}
