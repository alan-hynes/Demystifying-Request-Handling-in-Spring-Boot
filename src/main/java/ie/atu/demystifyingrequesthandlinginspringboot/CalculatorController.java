package ie.atu.demystifyingrequesthandlinginspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {

    @GetMapping
        public String add(@RequestParam int num1, int num2) {
            return "Answer: " + (num1 + num2); }

    @GetMapping
    public String subtract(@RequestParam int num1, int num2) {
            return "Answer: " + (num1 - num2); }
}
