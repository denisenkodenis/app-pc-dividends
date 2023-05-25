package ru.profitcase.dividends.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
@RunWith(SpringRunner.class)
@WebMvcTest(DividendsController.class)
public class DividendsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void pingTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/ping"))
                .andExpect(mvcResult ->
                    mvcResult.getResponse().getContentAsString().equals("pong"));
    }
}
