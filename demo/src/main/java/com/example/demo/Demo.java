package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }
}