package ru.profitcase.dividends.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.profitcase.dividends.dto.Dividend;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@EnableWebMvc
public class DividendsController {

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping(value = "/calendar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dividend>> calendar() {
        Dividend dividend1 = new Dividend();
        dividend1.setInstrumentName("test");
        dividend1.setPayValue(new BigDecimal(1.5));
        dividend1.setPayDate(new Date());
        dividend1.setType("Type1");

        Dividend dividend2 = new Dividend();
        dividend2.setInstrumentName("Sber");
        dividend2.setPayValue(new BigDecimal(180.5));
        dividend2.setPayDate(new Date());
        dividend2.setType("Type2");

        List<Dividend> answer = new ArrayList<>();
        answer.add(dividend1);
        answer.add(dividend2);
        return ResponseEntity.ok(answer);
    }
}
