package coaches.fortune;

import javax.annotation.PostConstruct;

public class GoodFortuneService implements FortuneService {
    
    public String getFortune() {
        return "You can do this!";
    }
    
    public void postConstruct() {
        System.out.println("postConstruct");
    }
    
    public void preDestroy() {
        System.out.println("preDestroy");
    }
}
