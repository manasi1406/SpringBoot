package com.Activity.Unit.Conversion.ServiceImpl;
import com.Activity.Unit.Conversion.Service.TemperatureConversionService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureConversionServiceImpl implements TemperatureConversionService, com.Activity.Unit.Conversion.ServiceImpl.Service {

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}





