package com.xc.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xc.entity.User;
import com.xc.service.DemoService;

public class Consumer {
	public static void main(String[] args) throws InterruptedException {
		String configLocation = "classpath*:/dubbo-consumer.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		DemoService demo = (DemoService) context.getBean("demoService");
		System.out.println("返回>> "+ demo.helloDubbox());
		User user = demo.getUserById("1001");
		System.out.println("返回 [用户名称]>> "+ user.getUsername());
	}
}
