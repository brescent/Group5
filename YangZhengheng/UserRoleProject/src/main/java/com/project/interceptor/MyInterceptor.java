package com.project.interceptor;

import com.project.controller.UserController;
import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class MyInterceptor implements HandlerInterceptor {

    @Autowired
    IUserService service;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
//        List<Object[]> ObjList = service.getRoleByUserId(user.getId());
//        List<PowerEntity> powerList = new ArrayList<>();
//        PowerEntity powerEntity = null;
//        List<Object[]> powerEntityList = service.getRoleByUserId(1);
//        for (Object[] obj : powerEntityList) {
//            int id = (int) obj[0];
//            String powerName = (String) obj[1];
//            String url = (String) obj[2];
//            powerEntity = new PowerEntity();
//            powerEntity.setId(id);
//            powerEntity.setPowerName(powerName);
//            powerEntity.setPowerUrl(url);
//            powerList.add(powerEntity);
//        }
    List<PowerEntity> powerList1= (List<PowerEntity>) request.getSession().getAttribute("powerList");
        String url1 = request.getRequestURI();
        String url=url1.substring(1);
        System.out.println("请求地址："+url);
        for (PowerEntity power : powerList1) {
            if (url.equals(power.getPowerUrl()) && url.equals("GoTOLogin")) {
                return true;
            }else {
                    System.out.println("没有权限");
                // response.sendRedirect("LoginPage.html");
                request.getRequestDispatcher("GoTOLogin").forward(request,response);

                return false;
            }

        }

          return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
