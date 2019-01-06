package example.nio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAnnotations {

    public static void main(String[] args) {

        // create application context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get beans from the container
        Coach firstCoach = context.getBean("tennisCoach", Coach.class);
        Coach secondCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Variables point to the same object: "
                + (firstCoach == secondCoach)
                + "\nfirstCoach: " + firstCoach.toString()
                + "\nsecondCoach: " + secondCoach.toString());

        context.close();
    }
}
