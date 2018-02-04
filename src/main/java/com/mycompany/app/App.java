package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Performer performer = (Performer)context.getBean("duke");
		performer.perform();
		Performer performer1 = (Performer)context.getBean("duke1");
		performer1.perform();
		Performer performer2 = (Performer)context.getBean("hank");
		performer2.perform();
		Instrumentalist performer3 = (Instrumentalist)context.getBean("kenny");
		performer3.perform();

	}

}
