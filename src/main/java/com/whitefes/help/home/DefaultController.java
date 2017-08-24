package com.whitefes.help.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {


    @RequestMapping("/home")
    public String home() {
        return "WEB-INF/view/welcome.html";
    }


}
