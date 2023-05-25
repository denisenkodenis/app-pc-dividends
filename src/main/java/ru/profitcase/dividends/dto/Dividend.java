package ru.profitcase.dividends.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class Dividend {
    private String instrumentName;

    private Date payDate;

    private BigDecimal payValue;

    private String type;
}
