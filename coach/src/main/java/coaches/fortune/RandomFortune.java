package coaches.fortune;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortune implements FortuneService {
    private String[] fortunes;
    
    public String getFortune() {
        int index = ThreadLocalRandom.current().nextInt(0, fortunes.length);
        return fortunes[index];
    }
    
    public void setFortunes(String[] fortunes) {
        this.fortunes = fortunes;
    }
}
