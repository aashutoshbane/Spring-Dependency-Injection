/**
 * 
 */
package com.di.xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashutosh Bane
 *
 */
public class SpringDIMainApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		ILaptop laptop= context.getBean("myHpLaptop", ILaptop.class);
		// ILaptop laptop= context.getBean("myDellLaptop", ILaptop.class);

		// call methods on the bean
		System.out.println(laptop.getConfiguration());
		
		// call methods on the DI
		System.out.println("Your service cycle is " + laptop.getServiceDueCycle());

		// close the context
		context.close();

	}

}
