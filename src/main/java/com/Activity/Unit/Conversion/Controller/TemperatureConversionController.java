package com.Activity.Unit.Conversion.Controller;

import com.Activity.Unit.Conversion.DTO.ConversionResponseDTO;
import com.Activity.Unit.Conversion.Service.TemperatureConversionService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TemperatureConversionController {

    @Autowired
    private TemperatureConversionService temperatureConversionService;

    @GetMapping("/convert/temperature/celsius-to-fahrenheit")
    public ResponseEntity<ConversionResponseDTO> convertCelsiusToFahrenheit(@RequestParam double value) {
        log.info("Converting Celsius to Fahrenheit: {} °C", value);
        double result = temperatureConversionService.celsiusToFahrenheit(value);
        log.info("Result: {} °F", result);
        return ResponseEntity.ok(new ConversionResponseDTO(result));
    }
}
