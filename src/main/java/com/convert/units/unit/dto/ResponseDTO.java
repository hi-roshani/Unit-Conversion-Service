package com.convert.units.unit.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@Data
public class ResponseDTO {
//    <T>
//    String status;
//    T response;
   HashMap<String, Double> responseMetric;
}
