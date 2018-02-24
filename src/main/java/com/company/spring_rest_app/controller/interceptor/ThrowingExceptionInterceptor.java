package com.company.spring_rest_app.controller.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

// throw Exception, when parameter 'exceptionParam' of request != null
public class ThrowingExceptionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getParameter("exceptionParam") != null) {
            throw new SQLException();
        }
        return true;
    }
}
