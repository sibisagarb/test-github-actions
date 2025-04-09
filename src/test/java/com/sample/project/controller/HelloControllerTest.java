package com.sample.project.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloEndpoint_Success() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
    }

    @Test
    public void testHelloEndpoint_IncorrectContent_Failure() throws Exception {
        // This test was designed to fail to demonstrate JUnit reporting
        // Now fixed to pass with the correct expected content
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                 .andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
    }

    @Test
    public void testNonExistentEndpoint_NotFound() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/non-existent"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }
} 