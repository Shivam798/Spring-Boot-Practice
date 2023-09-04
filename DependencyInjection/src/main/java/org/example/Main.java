package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        Bike b = (Bike) ac.getBean("bike");

//        b.setColor("Green");
//        b.getColor();
//        example2

        Bike b = (Bike) ac.getBean("bike",Bike.class);
        b.startEngine();
    }
}