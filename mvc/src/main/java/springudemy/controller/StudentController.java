package springudemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springudemy.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @RequestMapping("/enterStudent")
    public String enterStudent(@ModelAttribute("student") Student student) {
        return "student/enterStudent";
    }
    
    @RequestMapping("/showStudent")
    public String showStudent(@ModelAttribute("student") Student student) {
        return "student/showStudent";
    }
}
