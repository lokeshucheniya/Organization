package in.co.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrganizationTests {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Org.xml");
		
		Organization orgs =(Organization) context.getBean("org");
		System.out.println(orgs);
  	}
}
