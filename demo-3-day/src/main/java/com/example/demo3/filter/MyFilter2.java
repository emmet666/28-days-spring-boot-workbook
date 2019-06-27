package com.example.demo3.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author zejun.shu
 * @class MyFilter1
 * @date 2019-06-27
 **/
public class MyFilter2 implements Filter {
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		System.out.println("this is MyFilter 2 ,url :"+request.getRequestURI());
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init myFilter 2");
	}

	@Override
	public void destroy() {
		System.out.println("destroy myFilter 2");
	}
}
