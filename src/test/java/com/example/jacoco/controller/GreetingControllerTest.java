package com.example.jacoco.controller;

import com.example.jacoco.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetingController.class)
@Import(GreetingService.class)
class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greet_withName_returnsGreeting() throws Exception {
        mockMvc.perform(get("/greet").param("name", "Bob"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Bob!"));
    }

    @Test
    void greet_withoutName_returnsDefaultGreeting() throws Exception {
        mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }

    @Test
    void add_returnsSum() throws Exception {
        mockMvc.perform(get("/add").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }
}
