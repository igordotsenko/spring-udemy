package springudemy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value="/")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        System.out.println("Hanlding request... ");
        return new ModelAndView("home");
    }
    
    @RequestMapping(value="/helloForm")
    public ModelAndView helloForm() { // Looks like argument and exception in the signature are not mandatory
        return new ModelAndView("helloForm");
    }
    
    @RequestMapping(value="/helloPage")
    public ModelAndView helloPage() { // Looks like argument and exception in the signature are not mandatory
        return new ModelAndView("helloPage");
    }
    
    @RequestMapping(value="/helloFormToModel")
    public String helloFormToModel() { // Looks like argument and exception in the signature are not mandatory
        return "helloFormToModel";
    }
    
    @RequestMapping(value="/helloToModel")
    public String helloToModel(HttpServletRequest request,
                               Model model,
                               @RequestParam String lastname) { // So yeah, arguments list seems to be flexible
        String firstname = request.getParameter("firstname");
        
        model.addAttribute("firstnameCaps", firstname.toUpperCase());
        model.addAttribute("lastnameCaps", lastname.toUpperCase());
        
        return "helloPage";
    }
}
