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
		ILaptop laptop = context.getBean("myHpLaptop", ILaptop.class);
		// ILaptop laptop = context.getBean("myDellLaptop", ILaptop.class);

		// call methods on the bean
		System.out.println(laptop.getConfiguration());
		
		// call methods on the DI
		System.out.println("Your service cycle is " + laptop.getServiceDueCycle());
		
		
		/**
		 * The getServiceEmail() method is only defined in the implementation class.
		 * It is not part of the interface.
		 * The bottom line is it depends on how you retrieve the object and assign it ...
		 * that determines the visibility you have to the methods.
		 */
		// retrieve bean from spring container
		HpLaptop hp = context.getBean("myHpLaptop", HpLaptop.class);
		// DellLaptop dell = context.getBean("myDellLaptop", DellLaptop.class);
		
		// call our new methods to get literal values
		System.out.println("Service email: " + hp.getServiceEmail());
		System.out.println("HeadQuarters: " + hp.getHeadQuarters());
		// System.out.println("Service email: " + dell.getServiceEmail());
		// System.out.println("HeadQuarters: " + dell.getHeadQuarters());

		// close the context
		context.close();

	}

}
