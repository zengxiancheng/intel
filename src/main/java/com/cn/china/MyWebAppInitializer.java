package com.cn.china;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	//获取根容器的配置类（就类似于Spring的配置文件，以前是利用监听器方式读取配置文件）创建父容器；
			@Override
			protected Class<?>[] getRootConfigClasses() {
				// TODO Auto-generated method stub
				return new Class<?>[]{RootConfig.class};
			}

			//获取web容器的配置类（相当于以前的SpringMVC配置文件）创建 子容器；
			@Override
			protected Class<?>[] getServletConfigClasses() {
				// TODO Auto-generated method stub
				return new Class<?>[]{AppConfig.class};
			}

			//获取DispatcherServlet的映射信息
			//  /：拦截所有请求（包括静态资源（xx.js,xx.png）），但是不包括*.jsp；
			//  /*：拦截所有请求；连*.jsp页面都拦截；jsp页面是tomcat的jsp引擎解析的；所以，不要写成/*
			@Override
			protected String[] getServletMappings() {
				// TODO Auto-generated method stub
				return new String[]{"/"};
			}


}

