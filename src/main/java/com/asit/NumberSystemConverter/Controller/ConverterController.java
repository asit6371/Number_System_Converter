package com.asit.NumberSystemConverter.Controller;

import com.asit.NumberSystemConverter.Service.ConverterSerVice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {

    @Autowired
    private ConverterSerVice converterSerVice;

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @PostMapping("/convert")
    public String convertNumber(@RequestParam String number,
                                @RequestParam String fromType,
                                @RequestParam String toType,
                                Model model) {

        String result = converterSerVice.convert(number, fromType, toType);
        model.addAttribute("result", result);
        return "index";
    }


}
