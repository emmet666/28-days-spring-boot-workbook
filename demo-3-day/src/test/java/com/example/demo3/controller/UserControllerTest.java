package com.example.demo3.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class UserControllerTest {


	private MockMvc mvc;


	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(UserController.class).build();
	}

	@Test
	public void saveUser() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/")
			.param("username","")
			.param("age","666")
			.param("password","test")
		);
	}

	@Test
	public void getUser() {
		try {
			String result = this.mvc.perform(
				get("/").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andReturn()
				.getResponse()
				.getContentAsString();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	public void getConfig() {
		try {
			String req = "zj";
			String result = this.mvc.perform(
				get("/config/"+req).accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andReturn()
				.getResponse()
				.getContentAsString();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}