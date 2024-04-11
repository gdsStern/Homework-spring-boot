package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final CalculatorInterface serviceCalculator;

    public Controller(CalculatorInterface serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }
    @GetMapping
    public String start() {
        return serviceCalculator.start();
    }

    @GetMapping( path = "/calculator")
    public String hello() {
        return serviceCalculator.hello();
    }

    @GetMapping( path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculator.plus(num1, num2);
    }

    @GetMapping( path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculator.minus(num1, num2);
    }

    @GetMapping( path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculator.multiply(num1, num2);
    }

    @GetMapping( path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculator.divide(num1, num2);
    }

}
