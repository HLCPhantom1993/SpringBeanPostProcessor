package com.honglin_chen.spring_bean_post_processors.bean;

import org.springframework.beans.BeansException; 
import org.springframework.beans.factory.config.BeanPostProcessor;

/* 处理BeanPostProcessor的操作 */ 
public class MyBeanPostProcessor implements BeanPostProcessor {
	/* 重载postProcessBeforeInitialization函数在bean初始化前处理bean 
	 * Object: bean 传入的bean
	 * beanName: bean的名字
	 */
	@Override 
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("对于当前的bean: " + beanName + " 进行初始化之前的后续处理");
		return bean; 
	}
	
	/* 重载postProcessAfterInitialization函数在bean初始化之后处理bean
	 * Object: bean 将要处理的bean
	 * beanName: bean 的名字 
	 */
	@Override 
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("对于当前的bean: " + beanName + " 进行初始化之后的后续处理");
		return bean; 
	}
}
