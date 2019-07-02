package com.example.demofastdfs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zejun.shu
 * @class MyController
 * @date 2019-07-02
 **/

@RestController
public class MyController {

	@GetMapping("/")
	public String get() {
		return "get";
	}

	@PostMapping("/")
	public String post() {
		return "post";
	}

}
