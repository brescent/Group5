package com.project.handlerInterceptor;

import com.project.entity.UserEntity;
import com.project.service.IUservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class powerHandlerInterceptor implements HandlerInterceptor {

    @Autowired
    private IUservice uservice;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
 if(request.getAttribute("user")==null){

     response.sendRedirect("index.jsp");
     return false;
 }else{

     UserEntity  user= (UserEntity) request.getAttribute("user");



 }


        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
