package coaches.fortune;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService {
    
    public String getFortune() {
        return "You can do this!";
    }
}
