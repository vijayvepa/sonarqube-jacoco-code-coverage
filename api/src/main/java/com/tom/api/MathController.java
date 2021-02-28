package com.tom.api;

import com.tom.service.MathService;

public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    public int add(
            int firstNumber,
            int secondNumber){
        return mathService.multiply(firstNumber, secondNumber);
    }

    public int subtract(
            int firstNumber,
            int secondNumber){
        return mathService.subtract(firstNumber, secondNumber);
    }
}
