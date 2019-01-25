package com.honglin_chen.spring_bean_post_processors.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.honglin_chen.spring_bean_post_processors.bean.Customer;

public class CustomerService implements InitializingBean, DisposableBean {
	private Customer customer; 
	
	/* 客户服务类的构造函数 */ 
	public CustomerService() {
		System.out.println("这是CustomerService的构造函数"); 
	}
	
	public Customer getCustomer() {
		return customer; 
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer; 
	}
	
	@Override 
	public void afterPropertiesSet() throws Exception {
		System.out.println("这是afterPropertiesSet函数: 执行InitializaingBean接口"
				+ "处理bean在properties被设置完好后的情况"); 
	}
	
	@Override 
	public void destroy() throws Exception {
		System.out.println("这是destroy函数: 执行DisposableBean接口在Spring容器关闭后处理回收bean的情况"); 
	}
	
	public void customInitBean() throws Exception {
		System.out.println("这是自定义的bean初始化函数"); 
	}
	
	public void customDestroyBean() throws Exception {
		System.out.println("这是自定义的bean回收函数"); 
	}
	
	/* 重载两个接口的@PostConstruct和@PreDestroy注解 */ 
	@PostConstruct 
	public void postconstruct() {
		System.out.println("这里是注解函数@PostConstruct: 它在所有的setter函数运行完毕后处理一些初始化过程"); 
	}
	
	@PreDestroy
	public void predestroy() {
		System.out.println("这里是注解函数@PreDestroy: 它在Spring容器关闭之前执行回收bean的任务"); 
	}
}
