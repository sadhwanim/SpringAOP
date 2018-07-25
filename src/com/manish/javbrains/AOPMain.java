package com.manish.javbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.javbrains.service.Shape;

public class AOPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shape shape = (Shape)ctx.getBean("shape");
		shape.getCircle().setName("Yo Circle");;
		System.out.println(shape.getCircle().getName());
 	}

}
