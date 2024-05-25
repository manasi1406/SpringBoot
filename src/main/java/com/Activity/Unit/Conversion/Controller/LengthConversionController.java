package com.Activity.Unit.Conversion.Controller;
import com.Activity.Unit.Conversion.DTO.ConversionResponseDTO;
import com.Activity.Unit.Conversion.Service.LengthConversionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LengthConversionController {

    @Autowired
    private LengthConversionService lengthConversionService;

    @GetMapping("/convert/length/km-to-miles")
    public ResponseEntity<ConversionResponseDTO> convertKilometersToMiles(@RequestParam double value) {
        log.info("Converting Kilometers to Miles: {} km", value);
        double result = lengthConversionService.kilometersToMiles(value);
        log.info("Result: {} miles", result);
        return ResponseEntity.ok(new ConversionResponseDTO(result));
    }
}


