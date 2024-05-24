package com.convert.units.unit.serviceImpl;

import com.convert.units.unit.dto.TemperatureDTO;
import com.convert.units.unit.service.TemperatureService;
import org.springframework.stereotype.Service;

@Service
public class ConvertTemperature implements TemperatureService {
    @Override
    public Double convertToCelsious(TemperatureDTO temperatureDTO) {
        return ((temperatureDTO.getFahrenheit()-32)/(9/5));
    }

    @Override
    public Double convertToFahrenheit(TemperatureDTO temperatureDTO) {
        return (temperatureDTO.getCelsious()*((9/5)+32));
    }

}
