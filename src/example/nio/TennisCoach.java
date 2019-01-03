package example.nio;

import org.springframework.stereotype.Component;

// custom bean ID
// @Component("myTennisCoach")
// default bean ID
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley";
    }
}
