package org.mahanth;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args )
    {

        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("config.xml");
        /*
        The moment we create the object for applicationContext it will go to the configuration file, and then it will
        load all the configuration so whenever we call for vehicle we will get the car if bean is car
         */

        Vehicle vehicle1 = (Vehicle) applicationContext.getBean("vehicle");
        // Bean name should match the bean id in the config file
//        Vehicle vehicle2 = applicationContext.getBean(Car.class);
        /*
         If class type is mentioned then type casting is not required
         else we need to type cast with the corresponding applicable type to hold the reference
         */
//        Vehicle vehicle3 = applicationContext.getBean(Bus.class);

        vehicle1.drive();
//        vehicle2.drive();
//        vehicle3.drive();
    }
}
