package com.meuApp.webJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Clebson
 */
@RestController
public class WebServiceController {
    
    @GetMapping("/rest")
    public String takeRest() {
        System.out.println("Resting...");
        return "rest is olny necessary - Not a goal!";
    }
}
