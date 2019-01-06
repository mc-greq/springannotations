package example.nio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        JudoCoach judoCoach = context.getBean("myJudoCoach", JudoCoach.class);

        // call methods on the beans
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyFortune());
        System.out.println(((TennisCoach) coach).getEmail());
        System.out.println(((TennisCoach)coach).getTeamName());
        System.out.println(judoCoach.getDailyWorkOut());
        System.out.println(judoCoach.getMotivation());
        System.out.println(judoCoach.getDailyFortune());

        // close the container
        context.close();
    }
}
