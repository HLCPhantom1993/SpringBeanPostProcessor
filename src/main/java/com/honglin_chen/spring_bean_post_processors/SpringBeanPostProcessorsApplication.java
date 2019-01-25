package com.honglin_chen.spring_bean_post_processors;

import org.springframework.context.support.ClassPathXmlApplicationContext; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.honglin_chen.spring_bean_post_processors.service.CustomerService;

@SpringBootApplication
public class SpringBeanPostProcessorsApplication {

	public static void main(String[] args) {
		/* 创建应用文本载入构造xml文件 */ 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml"); 
		System.out.println("文本已被初始化"); 
		/* 通过全局文本构造bean */ 
		CustomerService service = (CustomerService) context.getBean("customerService");
		System.out.println("已经从文本中得到Bean, 接下来展示Bean的数据"); 
		System.out.println("客户的名字: " + service.getCustomer().getName());
		
		context.close(); 
	}

}

