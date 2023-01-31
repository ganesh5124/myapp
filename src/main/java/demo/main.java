package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String []args){
        System.out.println("Hello world");
        Doctor d = new Doctor();
        d.Doctor(" paracitmol");

        ApplicationContext context = new ClassPathXmlApplicationContext();
    }
}
