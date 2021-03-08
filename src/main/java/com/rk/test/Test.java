package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.rk.config.AppConfig;
import com.rk.service.RaviMailService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		FileSystemResource file = new FileSystemResource("C:\\Users\\Ravikant\\Desktop\\rk.jpg");
		RaviMailService mail = ac.getBean("raviMailService", RaviMailService.class);
		boolean flag = mail.send("pawarsuraj614@gmail.com", "welcome to rk", "Hi Suraj",
				new String[] { "vishwakarmaamit100@gmail.com", "padma.veernala@gmail.com" },
				new String[] { "jilla.sravankumar95@gmail.com", "pujithaparuchuri1@gmail.com" }, file);
		if (flag) {
			System.out.println("Message Sent!!Done");
		} else {
			System.out.println("Message Not Send");
		}
	}

}
