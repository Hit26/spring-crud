package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController is used for making restful web services with the help of the @RestController annotation. @restcontroller combination of the @controller and @ResponseBody annotation.
public class GetController {

    private GetService getService;
    public GetController(GetService getService) {
        this.getService = getService;
    }

    @GetMapping("details") //It maps HTTP GET requests to a specific handler method in Spring controllers.
    public ResponseEntity<String> details() { //ResponseEntity<> : Extension of HttpEntity that adds an HttpStatusCode status code
        return ResponseEntity.ok(getService.getDetails());
    }
}
