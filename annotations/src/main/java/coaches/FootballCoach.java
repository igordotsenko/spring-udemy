package coaches;

import coaches.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    private FortuneService fortuneService;
    private String name;
    
    public String getName() {
        return name;
    }
    
    @Autowired
    public FootballCoach(FortuneService goodFortuneService) {
        this.fortuneService = goodFortuneService;
    }
    
    public String getWorkout() {
        return "Play football";
    }
    
    public String getForutne() {
        return fortuneService.getFortune();
    }
}
