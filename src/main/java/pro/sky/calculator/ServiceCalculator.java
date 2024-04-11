package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculator implements CalculatorInterface {

    public String start() {
        return "Start Page";
    }

    public String hello() {
        return "Hello";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num2 + num1);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
