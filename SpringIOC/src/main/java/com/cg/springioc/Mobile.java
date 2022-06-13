package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{
	private static ApplicationContext c;

	public static void main(String[] args) {
		c = new ClassPathXmlApplicationContext("beans.xml");
		Sim s =(Sim)c.getBean("sim1");
		s.calling();
		s.data();
		}
}
