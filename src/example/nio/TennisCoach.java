package example.nio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// custom bean ID
// @Component("myTennisCoach")
// default bean ID
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
