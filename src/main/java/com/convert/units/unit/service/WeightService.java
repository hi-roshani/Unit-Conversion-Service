package com.convert.units.unit.service;

import com.convert.units.unit.dto.WeightDTO;

public interface WeightService {

    public Double convertToKilograms(WeightDTO weightDTO);
    public Double convertToPounds(WeightDTO weightDTO);
}
