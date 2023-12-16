package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(GetController.class) //testing annotation provided by the Spring Framework that focuses specifically on testing the web layer of a Spring MVC application
@AutoConfigureMockMvc //Annotation that can be applied to a test class to enable and configure auto-configuration of MockMvc.
public class GetControllerTest {

    @Autowired
    MockMvc mockMvc; //To test the web layer, we need MockMvc and by using @AutoConfigureMockMvc, we can write tests that will get injected.

    @Test
    void shouldGetNoPersonDetailsIfNotPresent() {
    }
}
