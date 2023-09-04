
package org.example;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.*;

import org.springframework.context.support.*;

class Keys{
    public void run(Engine key){
        key.show();
    }
}
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        Engine key = new Bike();
        Engine key = (Engine) ac.getBean("engine");
        new Keys().run(key);
    }
}
