package example.nio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// custom bean ID
// @Component("myTennisCoach")
// default bean ID
@Component
public class TennisCoach implements Coach {

    // field injection
    // added implementation of RegularFortuneService to show use of qualifier
    // having 2 implementations of same interface we need to tell Spring which one to use
//    @Autowired
//    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // default constructor, some debugging info
    public TennisCoach() {
        System.out.println(">> TennisCoach inside default constructor");
    }


    // using qualifier in a constructor is a bit different, has to be put inside passing variables
    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    /*
    // define setter method for injections
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }
    // if there are two methods @Autowired both will be used
    */

    // setter method for injection can have any name, just @Autowired it
    /*
    @Autowired
    public void anyMethodName(FortuneService fortuneService){
        System.out.println(">> TennisCoach: inside anyMethodName() method");
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
