package com.company.spring_rest_app.config;

import com.company.spring_rest_app.controller.interceptor.ThrowingExceptionInterceptor;
import com.company.spring_rest_app.controller.interceptor.TrackTimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan("com.company.spring_rest_app")
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @PostConstruct
    public void init() {
        requestMappingHandlerAdapter.setIgnoreDefaultModelOnRedirect(true);
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("validationMessages", "language");
        return messageSource;
    }

    @Bean
    LocaleResolver localeResolver() {
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(Locale.US);
        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
        localeResolver.setCookieName("localeInfo");
        localeResolver.setCookieMaxAge(-1);
        return localeResolver;
    }

    @Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

    @Bean
    public HandlerExceptionResolver errorHandler() {
        SimpleMappingExceptionResolver exResolver = new SimpleMappingExceptionResolver();
        // default settings
        exResolver.setDefaultErrorView("error/default-exception-page");
        exResolver.setDefaultStatusCode(400);
        //exception mapping
        Properties props = new Properties();
        props.setProperty(NullPointerException.class.getName(), "error/npe-exception-page");
        props.setProperty(ArithmeticException.class.getName(), "error/arithmetic-exception-page");
        exResolver.setExceptionMappings(props);
        return exResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // specifying static resource location for themes related files (css etc)
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // mapping '/' to index view name without a controller
        ViewControllerRegistration vcr = registry.addViewController("/");
        vcr.setViewName("index");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("WEB-INF/views/", ".jsp");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TrackTimeInterceptor());

        // register LocaleChangeInterceptor
        registry.addInterceptor(new LocaleChangeInterceptor());

        // interceptor, which thow exception, when parameter 'exceptionParam' of request != null
        registry.addInterceptor(new ThrowingExceptionInterceptor());
    }
}
