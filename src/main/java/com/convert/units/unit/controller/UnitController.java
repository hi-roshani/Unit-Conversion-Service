package com.convert.units.unit.controller;

import com.convert.units.unit.dto.*;
import com.convert.units.unit.service.LengthService;
import com.convert.units.unit.service.TemperatureService;
import com.convert.units.unit.service.TimeService;
import com.convert.units.unit.service.WeightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Slf4j
@RestController
public class UnitController {

    @Autowired
    private LengthService lengthService;

    @Autowired
    private TemperatureService temperatureService;

    @Autowired
    private TimeService timeService;

    @Autowired
    private WeightService weightService;


    @PostMapping("/conversion/length/value")
    public ResponseDTO convertLength(@RequestBody LengthDTO lengthDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        log.info("converting length");
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Kilometers",lengthService.convertToKm(lengthDTO));
        hm.put("Miles",lengthService.convertToMiles(lengthDTO));
        responseDTO.setResponseMetric(hm);
//        responseDTO.setFirstValue(Double.valueOf(lengthService.convertToKm(lengthDTO)));
//        responseDTO.setSecondValue(Double.valueOf(lengthService.convertToMiles(lengthDTO)));
        return responseDTO ;
    }

    @PostMapping("/conversion/temp/value")
    public ResponseDTO convertTemperature(@RequestBody TemperatureDTO temperatureDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        log.info("converting temperature");
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Celsious",temperatureService.convertToCelsious(temperatureDTO));
        hm.put("Fahrenheit",temperatureService.convertToFahrenheit(temperatureDTO));
        responseDTO.setResponseMetric(hm);
        //validation here
//        responseDTO.setFirstValue(Double.valueOf(temperatureService.convertToCelsious(temperatureDTO)));
//        responseDTO.setSecondValue(Double.valueOf(temperatureService.convertToFahrenheit(temperatureDTO)));
        return responseDTO;
    }

    @PostMapping("/conversion/time/value")
    public ResponseDTO convertTime(@RequestBody TimeDTO timeDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        log.info("converting time");
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Seconds",timeService.convertToSeconds(timeDTO));
        hm.put("Minutes",timeService.convertToMinutes(timeDTO));
        responseDTO.setResponseMetric(hm);
        //        responseDTO.setFirstValue(timeService.convertToSeconds(timeDTO));
        //        responseDTO.setSecondValue(timeService.convertToMinutes(timeDTO));
        return responseDTO;
    }

    @PostMapping("/conversion/weight/value")
    public ResponseDTO convertWeight(@RequestBody WeightDTO weightDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        log.info("converting weight");
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Kilograms",weightService.convertToKilograms(weightDTO) );
        hm.put("Pounds", weightService.convertToPounds(weightDTO));
        responseDTO.setResponseMetric(hm);
//        responseDTO.setFirstValue(weightService.convertToKilograms(weightDTO));
//        responseDTO.setSecondValue(weightService.convertToPounds(weightDTO));
        return responseDTO;
    }

}
