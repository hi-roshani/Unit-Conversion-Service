package com.convert.units.unit.serviceImpl;

import com.convert.units.unit.dto.LengthDTO;
import com.convert.units.unit.service.LengthService;
import org.springframework.stereotype.Service;

@Service
public class ConvertLength implements LengthService {
    @Override
    public Double convertToKm(LengthDTO lengthDTO) {
        return lengthDTO.getMiles()*1.61;
    }

    @Override
    public Double convertToMiles(LengthDTO lengthDTO) {
        return lengthDTO.getKiloMeter()/1.61;
    }

}
