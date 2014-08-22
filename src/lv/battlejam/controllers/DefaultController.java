package lv.battlejam.controllers;

import javax.servlet.http.HttpSession;

import lv.battlejam.usermanagment.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model map, HttpSession session) {
        String username = System.getProperty("user.name");
        if (username.contains(".")) {
            Member member = new Member(username.split("\\.")[0],username.split("\\.")[1]);
            session.setAttribute("user", member);
        }
        return "redirect:/home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model map) {

        return "jsp/home.jsp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model map) {

        return "jsp/login.jsp";
    }
    
}
