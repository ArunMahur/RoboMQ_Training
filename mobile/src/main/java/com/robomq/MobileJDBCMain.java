package com.robomq;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robomq.config.AppConfig;
import com.robomq.dao.MobileDao;
import com.robomq.pojo.Mobile;


public class MobileJDBCMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		MobileDao mobileDao=context.getBean(MobileDao.class);
		System.out.println("Lst of MObiles is :: ");
		
		for(Mobile m:mobileDao.getAllPersons()) {
			System.out.println(m);
		}
		System.out.println("\n Get Mobiles with id");
		
		Mobile mobileById=mobileDao.getPersonById(2);
		System.out.println(mobileById);
		
		System.out.println("\n creating mobiles:: ");
		Mobile mobile=new Mobile(6,"oppo","4609","50","4");
		System.out.println(mobile);
		mobileDao.createPerson(mobile);
		System.out.println("\n list of mobiles is:: ");
		
		for(Mobile m:mobileDao.getAllPersons()) {
			System.out.println(m);
		}
		
		System.out.println("\n Deleting mobile with id 2");
		mobileDao.deletePerson(mobileById);
		
		System.out.println("\n deleting mobile with id 4");
		
		Mobile mmobile=mobileDao.getPersonById(4);
		mmobile.setQty("changed!!!");
		mobileDao.updatePerson(mmobile);
		
		System.out.println("\n list of mobile is ::");
		for(Mobile m:mobileDao.getAllPersons()) {
			System.out.println(m);
		}

		context.close();
	}

}
