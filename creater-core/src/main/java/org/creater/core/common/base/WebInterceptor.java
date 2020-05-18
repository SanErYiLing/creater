package org.creater.core.common.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.dubbo.rpc.RpcException;
import org.springframework.web.servlet.HandlerInterceptor;

public class WebInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		System.out.println("执行了TestInterceptor的preHandle方法");
		if (request.getHeader("authorization") != null) {
			System.out.println("获取到token");
			return true;
		}
		throw new RpcException("未登录");
		
	}
}
