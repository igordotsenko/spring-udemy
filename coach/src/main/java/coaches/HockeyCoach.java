package coaches;

import coaches.fortune.FortuneService;

public class HockeyCoach implements Coach {
    
    private FortuneService fortuneService;
    private String name;
    
    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    public String getWorkout() {
        return "Play hockey";
    }
    
    public String getFortune() {
        return fortuneService.getFortune();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
