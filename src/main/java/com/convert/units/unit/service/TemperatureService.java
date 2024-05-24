package com.convert.units.unit.service;

import com.convert.units.unit.dto.TemperatureDTO;

public interface TemperatureService {

    public Double convertToCelsious(TemperatureDTO temperatureDTO);
    public Double convertToFahrenheit(TemperatureDTO temperatureDTO);
}
