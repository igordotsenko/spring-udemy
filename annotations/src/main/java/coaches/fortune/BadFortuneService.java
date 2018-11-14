package coaches.fortune;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {
    
    public String getFortune() {
        return "You are looser";
    }
}
