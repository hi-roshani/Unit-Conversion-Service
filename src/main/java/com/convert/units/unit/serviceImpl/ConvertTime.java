package com.convert.units.unit.serviceImpl;

import com.convert.units.unit.dto.TimeDTO;
import com.convert.units.unit.service.TimeService;
import org.springframework.stereotype.Service;

@Service
public class ConvertTime implements TimeService {
    @Override
    public Double convertToSeconds(TimeDTO timeDTO) {
        return timeDTO.getMinutes()*60;
    }

    @Override
    public Double convertToMinutes(TimeDTO timeDTO) {
        return timeDTO.getSeconds()/60;
    }

}
