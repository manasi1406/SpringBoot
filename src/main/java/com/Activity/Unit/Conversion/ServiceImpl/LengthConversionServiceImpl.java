package com.Activity.Unit.Conversion.ServiceImpl;
import com.Activity.Unit.Conversion.Service.LengthConversionService;
import org.springframework.stereotype.Service;
@Service
public class LengthConversionServiceImpl implements LengthConversionService, miles {

    @Override
    public double kilometersToMiles(double kilometers) {
        try {
            return kilometers * 0.621371;
        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }


    @Override
    public double milesToKilometers(double miles) {
        try {
            return miles * 1.60934;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
