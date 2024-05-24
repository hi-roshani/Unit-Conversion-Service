package com.convert.units.unit.service;

import com.convert.units.unit.dto.LengthDTO;

public interface LengthService {

    public Double convertToKm(LengthDTO lengthDTO);
    public Double convertToMiles(LengthDTO lengthDTO);

}
