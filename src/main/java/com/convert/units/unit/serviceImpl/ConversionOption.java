package com.convert.units.unit.serviceImpl;

import com.convert.units.unit.service.LengthService;



public class ConversionOption {
    public LengthService getConversion(String type) throws Exception {
        ConvertLength convertLength = new ConvertLength();
        ConvertTemperature convertTemperature = new ConvertTemperature();
        ConvertTime convertTime = new ConvertTime();
        ConvertWeight convertWeight = new ConvertWeight();

//        if (type.equalsIgnoreCase("TEMPERATURE")) {
//            return convertTemperature;
//        }
//        else if (type.equalsIgnoreCase("length")){
//            return convertLength;
//        }
//        else if (type.equalsIgnoreCase("time")) {
//            return convertTime;
//        }
//        else if(type.equalsIgnoreCase("weight")) {
//            return convertWeight;
//        }
//        else{
//            throw new Exception();
//        }
        return null;
    }
}


