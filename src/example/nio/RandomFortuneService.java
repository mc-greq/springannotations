package example.nio;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class RandomFortuneService implements FortuneService {

    // array of String of fortunes
    private String[] fortunes = {
            "Don't cry wolf",
            "Diligence is a mother of good luck",
            "The journey is the reward"
    };

    // create a random nr generator
    @Override
    public String getFortune() {
        int index = new Random().nextInt(fortunes.length);

        // return random String from an array
        return fortunes[index];
    }
}
