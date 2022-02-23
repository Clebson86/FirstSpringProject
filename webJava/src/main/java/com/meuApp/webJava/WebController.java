package com.meuApp.webJava;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Clebson
 */
@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("Saying Hello...");
        model.addAttribute("mensagem", "Sejam bem-vindos ao Spring Boot com NetBeans IDE!");
        return "hello";
    }
}


