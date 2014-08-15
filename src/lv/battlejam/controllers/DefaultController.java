package lv.battlejam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model map){
        String user = System.getProperty("user.name");
        map.addAttribute("username", user);
        return "redirect:/index";
    }
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model map){
        
        return "index.jsp";
    }
    
    
}
