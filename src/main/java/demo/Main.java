package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Application context is an Interface that extends Bean Factory
        // We can get beans using either of them but Application context has some additional methods of its own
        // Spring xml file will be passed in the Application context Interface
        // then using the .get bean method from the Bean Factory Interface we will get the bean
        // Here we are passing the Leader.class in the get bean method that is called dependency injection
        // And Inversion of control to spring framework is done by dependency injection
        // Thus we achieved inversion of control by dependency injection


        // Injecting Spring.xml file to application context
       // ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);

        // Dependency injection of Leader Class as a class name
        Leader  leader=applicationContext.getBean(Leader.class);
//        Leader leader1=applicationContext.getBean(Leader.class);

        // Dependency injection of assistant class as a xml id
        //Assistant assistant=(Assistant) applicationContext.getBean("assistant");
//        Assistant assistant=applicationContext.getBean(Assistant.class);

        // Accessing the methods of the classes
        leader.working();
        // Default scope will be Singleton so if we define one Object it will that instance only will be returned for all the request
//        leader.setQualification("Experienced");
//        System.out.println(leader);
        // so here for leader1 also will get same Qualification object
//        System.out.println(leader1);
//        assistant.working();

        // Getting the property of the classes
//        System.out.println(leader.getQualification());
//        System.out.println(assistant.getQualification());

    }

}
