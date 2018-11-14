package coaches.fortune;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    
    @Value("${foruntes}")
    private String[] fortunes;
    
    public String getFortune() {
        int index = ThreadLocalRandom.current().nextInt(fortunes.length);
        
        return fortunes[index];
    }
    
    @PostConstruct
    private void postConst() {
        System.out.println("postConst");
        Arrays.stream(fortunes).forEach(System.out::println);
    }
    
    @PreDestroy
    private void preDestr() {
        System.out.println("preDestr");
    }
}
