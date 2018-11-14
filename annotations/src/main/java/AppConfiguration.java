import coaches.Coach;
import coaches.SwimCoach;
import coaches.fortune.FortuneService;
import coaches.fortune.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("coaches")
@PropertySource("classpath:coach.properties")
public class AppConfiguration {
    
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
    
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
