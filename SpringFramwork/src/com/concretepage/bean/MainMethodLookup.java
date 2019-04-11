package com.concretepage.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethodLookup {

	public static void main(String[] args)
	{
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		TicketVenderMachine machine = abstractApplicationContext.getBean("ticketvenderMachine",TicketVenderMachine.class);
		
		Ticket ticket = machine.generateTicket();
		System.out.println(ticket.printTicket());
	}
}
