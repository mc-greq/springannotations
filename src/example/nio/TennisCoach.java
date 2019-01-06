package example.nio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// custom bean ID
// @Component("myTennisCoach")
// default bean ID
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // default constructor, some debugging info
    public TennisCoach() {
        System.out.println(">> TennisCoach inside default constructor");
    }

    // define setter method for injections
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }


    /*
    // injecting dependency into constructor
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
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
