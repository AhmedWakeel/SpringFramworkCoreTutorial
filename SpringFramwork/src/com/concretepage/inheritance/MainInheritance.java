package com.concretepage.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInheritance
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
			new ClassPathXmlApplicationContext("spring.xml");

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);
    	
    }
}