package com.melihyelman.springboot.first_web_app.login;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

@Controller
public class LoginController {
//    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name",name);
//        logger.debug("Request param is {}",name);
//        System.out.println(name);
        return "login";
    }
}
