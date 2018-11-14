package coaches;

import coaches.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {
    @Value("${name}")
    private String name;
    
    private FortuneService fortuneService;
    
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getWorkout() {
        return "Swin!";
    }
    
    @Override
    public String getForutne() {
        return fortuneService.getFortune();
    }
    
    @Override
    public String getName() {
        return name;
    }
}
