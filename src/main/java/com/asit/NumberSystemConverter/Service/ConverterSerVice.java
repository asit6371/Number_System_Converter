package com.asit.NumberSystemConverter.Service;

import org.springframework.stereotype.Service;

@Service
public class ConverterSerVice {

    public String convert(String number, String fromType, String toType) {
        int decimalValue = switch (fromType.toLowerCase()) {
            case "binary" -> Integer.parseInt(number, 2);
            case "octal" -> Integer.parseInt(number, 8);
            case "hex" -> Integer.parseInt(number, 16);
            default -> Integer.parseInt(number);
        };

        return switch (toType.toLowerCase()) {
            case "binary" -> Integer.toBinaryString(decimalValue);
            case "octal" -> Integer.toOctalString(decimalValue);
            case "hex" -> Integer.toHexString(decimalValue).toUpperCase();
            default -> String.valueOf(decimalValue);
        };
    }
}
