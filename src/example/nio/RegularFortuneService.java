package example.nio;

import org.springframework.stereotype.Component;

@Component
public class RegularFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This is just regular FortuneService";
    }
}
