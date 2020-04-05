package com.powerProject.confi;


import com.powerProject.util.Myinterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 配置web中的配置
 */
@Component
public class MyWebConfiguer implements WebMvcConfigurer {

    //拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Myinterceptor())
                .addPathPatterns("/**")  //拦截
                .excludePathPatterns("/login")  //放行
               ;
    }

    /**
     * 放行静态资源
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
     //放行的文件
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
