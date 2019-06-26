# Spring 项目结构与demo程序

## 项目结构

```
myproject
 +-src
    +- main
         +- java
              +- com.example.myproject
                    +- comm
                    +- model
                    +- repository
                    +- service
                    +- web
                    +- Application.java
         +- resources
              +- static
              +- templates
              +- application.properties
    +- test
 +-pom.xml
```
> 由于，自己建立的demo过于简单不足以说明项目结构情况，因此使用可见中的

- Application.java: 建议放在根目录，启动类
- comm: 建议放置公共的类，如全局的配置文件、工具类等
- model: 主要用于实体（Entity）与数据访问层（Repository）,数据库表结构
- repository： 数据库访问层代码
- service： 主要是业务类代码
- web：负责页面访问控制
- static 目录存放 web 访问的静态资源，如 js、css、图片
- templates 目录存放页面模板
- application.properties 存放项目的配置信息
- test 目录存放单元测试的代码；pom.xml 用于配置项目依赖包，以及其他配置


## 示例程序

- 主体功能：访问 默认端口的 “/”路径 浏览器中输出hello spring，并进行单元测试

- 主要代码

```
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxx
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
```

- 测试用例代码

```
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
```



