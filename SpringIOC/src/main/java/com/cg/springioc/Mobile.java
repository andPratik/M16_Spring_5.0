package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("program is exuted");
		Sim s = c.getBean("sim",Sim.class);
		s.calling();
		s.data();
		}
}
