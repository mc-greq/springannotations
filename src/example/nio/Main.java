package example.nio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // call method on the bean
        System.out.println(coach.getDailyWorkOut());

        // close the container
        context.close();
    }
}
