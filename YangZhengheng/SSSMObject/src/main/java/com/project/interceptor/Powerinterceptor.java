package com.project.interceptor;

import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import com.project.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class Powerinterceptor  implements HandlerInterceptor {


    @Autowired
    IUserService service;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        List<Object[]> ObjList = service.getRoleByUserId(user.getId());
        List<PowerEntity> powerList = new ArrayList<>();
        PowerEntity powerEntity = null;
        List<Object[]> powerEntityList = service.getRoleByUserId(1);
        for (Object[] obj : powerEntityList) {

            int id = (int) obj[0];
            String powerName = (String) obj[1];
            String url = (String) obj[2];
            powerEntity = new PowerEntity();
            powerEntity.setId(id);
            powerEntity.setPowerName(powerName);
            powerEntity.setPowerUrl(url);
            powerList.add(powerEntity);
        }
        // System.out.println("getUrl="+request.getRequestURI());
        String url = request.getRequestURI();
        String getURl = url.substring(12);
        // System.out.println(getURl);
        for (PowerEntity power : powerList) {
            if (getURl.equals(power.getPowerUrl()) && getURl.equals("find") && getURl.equals("login")) {
                return true;
            }else {
                response.sendRedirect("index.jsp");
                return false;
            }

        }


        return  false;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
