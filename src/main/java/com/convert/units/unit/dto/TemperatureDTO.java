package com.convert.units.unit.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TemperatureDTO {
    private Double celsious;
    private Double fahrenheit;
}
