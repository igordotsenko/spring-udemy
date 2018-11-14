import coaches.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
    public static void main(String[] args) {
//        String contextPath = "annotations-spring-config.xml";
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextPath);
    
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        
        Coach coach = context.getBean("swimCoach", Coach.class);
    
        System.out.println(coach.getWorkout());
        System.out.println(coach.getForutne());
        System.out.println(coach.getName());
        
        context.close();
    }
    
}
