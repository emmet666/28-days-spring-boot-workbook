package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zejun.shu
 * @class DemoController
 * @date 2019-06-26
 **/

@RestController
public class DemoController {

	@RequestMapping("/")
	public String hello() {
		return "hello spring";
	}
}
