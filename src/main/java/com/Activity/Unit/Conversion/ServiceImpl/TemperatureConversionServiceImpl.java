package com.Activity.Unit.Conversion.ServiceImpl;
import com.Activity.Unit.Conversion.Service.TemperatureConversionService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureConversionServiceImpl implements TemperatureConversionService, com.Activity.Unit.Conversion.ServiceImpl.TemperatureConversionService {

    @Override
    public double celsiusToFahrenheit(double celsius) {
        try {
            return (celsius * 9 / 5) + 32;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        try {
            return (fahrenheit - 32) * 5 / 9;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
