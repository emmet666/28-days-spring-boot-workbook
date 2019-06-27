package com.example.demo3.controller;

import com.example.demo3.module.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author zejun.shu
 * @class UserController
 * @date 2019-06-27
 **/
@RestController
public class UserController {

	@Value("${neo.title}")
	private String config;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveUser(@Valid User user, BindingResult result) {
		System.out.println(user);
		if(result.hasErrors()) {
			List<ObjectError> list = result.getAllErrors();
			for (ObjectError error : list) {
				System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
			}
		}

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public User getUser() {
		User user = User.builder()
			.age(19)
			.password("123456")
			.username("张三娃")
			.build();
		return user;
	}

	@RequestMapping(value = "/config/{name}", method = RequestMethod.GET)
	public String getConfig(@PathVariable String name) {

		return name + config;
	}

}
