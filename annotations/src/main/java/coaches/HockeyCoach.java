package coaches;

import coaches.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    
    @Value("${name}")
    private String name;
    
    public String getName() {
        return name;
    }
    
    public String getWorkout() {
        return "Play hockey";
    }
    
    public String getForutne() {
        return fortuneService.getFortune();
    }
}
