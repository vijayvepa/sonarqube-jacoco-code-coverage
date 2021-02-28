package com.tom.api;

import com.tom.service.MathService;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MathControllerTests {

    private final MathController mathController = new MathController(new MathService());

    @Test
    public void subtract_whenSecondOneGreater_thenReturnsNegative(){
        final int subtract = mathController.subtract(9, 19);
        assertTrue(subtract < 0);
    }
}
