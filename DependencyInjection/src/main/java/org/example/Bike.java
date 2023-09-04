package org.example;

public class Bike {
//    String color;
    Engine engine;
    public Bike(Engine engine){
        this.engine=engine;
        System.out.println("I am constructor");
    }

    public void startEngine(){
        if(engine==null){
            System.out.println("Engine is null");
        }
        else{

            engine.start();
        }
    }
//    public  void getColor() {
//        System.out.println("Color is "+color);
//
//    }

//    public void setColor(String color) {
//        this.color = color;
//    }

}
