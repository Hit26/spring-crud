package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@WebMvcTest(GetController.class)
//testing annotation provided by the Spring Framework that focuses specifically on testing the web layer of a Spring MVC application
@AutoConfigureMockMvc
//Annotation that can be applied to a test class to enable and configure auto-configuration of MockMvc.
public class GetControllerTest {

    @Autowired
    MockMvc mockMvc; //To test the web layer, we need MockMvc and by using @AutoConfigureMockMvc, we can write tests that will get injected.

    @MockBean       //@MockBean to add mock objects to the Spring application context.
    GetService getService;

    @Test
    void shouldGetNoPersonDetailsIfNotPresent() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/details")) //mockMvc.perform is used to perform requests and verify responses.
                .andExpect(MockMvcResultMatchers.status().isOk())       //andExpect Performs an expectation.
                .andExpect(content().string(""));
    }

    @Test
    void shouldReturnDetailsFromServiceLayer() throws Exception {


        Mockito.when(getService.getDetails()).thenReturn("detailFromService");

        mockMvc.perform(MockMvcRequestBuilders.get("/details"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string("detailFromService"));
    }
}
