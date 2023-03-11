package com.example.zuulservice.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

	protected Log log = LogFactory.getLog(LoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		boolean flag = true;

		//ajax일경우 응답 코드 설정
		if( isAjaxRequest(request)){
			response.sendError(401);
			flag = false;
		}

        return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	//ajax여부 확인
	private boolean isAjaxRequest(HttpServletRequest req) {
		String header = req.getHeader("x-requested-with");

		if( "XMLHttpRequest".equals(header) ){
			return true;
		} else {
			return false;
		}
	}
}