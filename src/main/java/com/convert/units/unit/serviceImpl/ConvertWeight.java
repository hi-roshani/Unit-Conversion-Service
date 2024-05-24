package com.convert.units.unit.serviceImpl;

import com.convert.units.unit.dto.WeightDTO;
import com.convert.units.unit.service.WeightService;
import org.springframework.stereotype.Service;

@Service
public class ConvertWeight implements WeightService {

    @Override
    public Double convertToKilograms(WeightDTO weightDTO) {
        return weightDTO.getPound()*0.45;
    }

    @Override
    public Double convertToPounds(WeightDTO weightDTO) {
        return weightDTO.getKiloGram()*2.20;
    }

}
