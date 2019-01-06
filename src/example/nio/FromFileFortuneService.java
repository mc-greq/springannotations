package example.nio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FromFileFortuneService implements FortuneService {

    @Value("${foo.first.fortunes}")
    private String[] fortunes;

    @Override
    public String getFortune() {
        int randomIndex = new Random().nextInt(fortunes.length);
        return fortunes[randomIndex];
    }
}
