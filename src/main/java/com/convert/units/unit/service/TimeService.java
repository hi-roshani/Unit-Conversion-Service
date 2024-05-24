package com.convert.units.unit.service;

import com.convert.units.unit.dto.TemperatureDTO;
import com.convert.units.unit.dto.TimeDTO;

public interface TimeService {
    public Double convertToSeconds(TimeDTO timeDTO);
    public Double convertToMinutes(TimeDTO timeDTO);
}
