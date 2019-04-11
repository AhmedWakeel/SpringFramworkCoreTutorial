package com.concretepage.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.concretepage.bean.Employee;
public class SpringDemo {
	public static void main(String[] args) {
		
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("app-conf.xml");
	    Employee emp=(Employee) ctx.getBean("empp");
	    System.out.println(emp.getAddressddd().getCity()+" "+emp.getCompany().getCompName());
      		
		
	/*	AbstractApplicationContext  context = new ClassPathXmlApplicationContext("app-conf.xml");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee.getAddressddd().getCity());
		System.out.println(employee.getCompany().getCompName());		
		context.close();*/
	    
	    
		
		
	}
} 


/*package com.concretepage.bean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.concretepage.bean.Employee;
public class SpringDemo {
	public static void main(String[] args)  {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    Employee employee = ctx.getBean(Employee.class);
	    System.out.println(employee.getAddress().getCity());
	    System.out.println(employee.getCompany().getCompName());
    	    ctx.close();
	}
}  */