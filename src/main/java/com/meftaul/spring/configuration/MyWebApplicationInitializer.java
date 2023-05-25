package com.meftaul.spring.configuration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("======================");
        System.out.println("My Application initializing...");

        // Create aplication context IOC container
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(AppConfig.class);

        // create a dispatcher servlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        // register the dispatcher servlet with the servlet context object
        ServletRegistration.Dynamic customServletContext =
                servletContext.addServlet("myDispatcherServlet", dispatcherServlet);

        customServletContext.setLoadOnStartup(1);
        customServletContext.addMapping("/api/*");
    }
}
