package com.example.demo3.module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author zejun.shu
 * @class User
 * @date 2019-06-27
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	@NotEmpty(message = "username 不能为空")
	private String username;

	@Length(min = 6)
	private String password;

	@Min(15)
	private Integer age;
}
