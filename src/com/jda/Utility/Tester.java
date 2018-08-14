package com.jda.Utility;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jda.beans.Shape;

public class Tester {

	public static void main(String[] args){

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "SpringContext.xml");
        Shape shape =  (Shape) context.getBean("MyBeans");
        System.out.println(shape.getMessage());  
	}
}
