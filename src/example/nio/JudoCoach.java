package example.nio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myJudoCoach")
public class JudoCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public JudoCoach(@Qualifier("fromFileFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice 50 throws";
    }

    public String getMotivation(){
        return "Get to work!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
