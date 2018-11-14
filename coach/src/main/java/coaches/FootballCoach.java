package coaches;

import coaches.fortune.FortuneService;

public class FootballCoach implements Coach {
    
    private FortuneService fortuneService;
    private String name;
    
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    public String getWorkout() {
        return "Play football";
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
