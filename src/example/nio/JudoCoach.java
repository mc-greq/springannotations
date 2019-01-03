package example.nio;


import org.springframework.stereotype.Component;

@Component("myJudoCoach")
public class JudoCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice 50 throws";
    }

    public String getMotivation(){
        return "Get to work!";
    }
}
