package com.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ApidemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome to api-demo application!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ApidemoApplication.class, args);
    }

}
