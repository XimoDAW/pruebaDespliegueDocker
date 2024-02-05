package com.despliegueDocker.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
    @GetMapping("/")
    public String getPage() {
        return "pag.html";
    }
}
