package lv.battlejam.controllers;

import javax.servlet.http.HttpSession;

import lv.battlejam.dbmanagment.AccountManagment;
import lv.battlejam.usermanagment.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model map, HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        } else {
            return "redirect:/home";
        }
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model map, HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        } else {
            return "jsp/home.jsp";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model map) {

        return "jsp/login.jsp";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String auth(@RequestParam("username") String username,
                       @RequestParam("password") String password, Model map,
                       HttpSession session) {

        if (AccountManagment.login(username, password)) {
            if (username.contains(".")) {
                Member member =
                    new Member(username.split("\\.")[0],
                        username.split("\\.")[1]);
                session.setAttribute("user", member);
            }
            return "redirect:/home";
        } else {
            return "redirect:/login?error=1";
        }
    }

}
