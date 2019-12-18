package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		SessionFactory sessFact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session sess = sessFact.openSession();
		
		Employee emp = new Employee();
		emp.setName("Neeraj Bhatt");
		emp.setAddress("Delhi");
		emp.setSalary(120000);
		
		sess.beginTransaction();
		sess.persist(emp);
		sess.getTransaction().commit();
		
		System.out.println("Done !!!");

	}

}
