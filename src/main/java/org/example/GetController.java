package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController is used for making restful web services with the help of the @RestController annotation. @restcontroller combination of the @controller and @ResponseBody annotation.
public class GetController {
    @GetMapping("details") //It maps HTTP GET requests to a specific handler method in Spring controllers.
    public String details() {
        return "details";
    }
}
