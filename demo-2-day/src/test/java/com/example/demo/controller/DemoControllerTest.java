package com.example.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTest {

	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
	}

	@Test
	public void hello() throws Exception {
		mockMvc.perform(
			MockMvcRequestBuilders.get("/")
			.accept(MediaType.APPLICATION_JSON_VALUE))
//			.andDo(print())
			.andExpect(MockMvcResultMatchers.content().string("hello spring"))
//		.andExpect(MockMvcResultMatchers.content().string("hello spring1")) // error
		;
	}
}