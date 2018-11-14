import coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Coach coach = context.getBean("coach", Coach.class);
    
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortune());
        System.out.println(coach.getName());
        
        context.close();
    }
}
