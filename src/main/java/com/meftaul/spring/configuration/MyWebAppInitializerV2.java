package com.meftaul.spring.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializerV2 extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class arr[] = {WebMvcConfig.class};
        return arr;
    }

    @Override
    protected String[] getServletMappings() {
        String arr[] = { "/api/*" };
        return arr;
    }
}
