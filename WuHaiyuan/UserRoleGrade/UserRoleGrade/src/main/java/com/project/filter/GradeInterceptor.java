package com.project.filter;

import com.project.entity.GradeEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GradeInterceptor implements HandlerInterceptor {


    @Autowired
    IUserService service;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");

        // System.out.println("getUrl="+request.getRequestURI());
        String url = request.getRequestURI();
        System.out.println(url);
        if (user == null) {
            return false;
        } else {
            for (GradeEntity g : user.getGeades()) {
                if (url.endsWith(g.getGradeResource())) {
                    return true;
                } else {
                    response.sendRedirect("login.html");
                    return false;
                }
            }
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
