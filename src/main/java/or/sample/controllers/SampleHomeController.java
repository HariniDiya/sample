package or.sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleHomeController {

    @RequestMapping("login")
    public String login()
    {
        return "login";
    }

    @RequestMapping("logout")
    public String logout()
    {
        return "newuser";
    }

    @RequestMapping("signup")
    public String signup()
    {
        return "signup";
    }


}
