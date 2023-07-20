package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void shouldAddTwoNumbersProperly() {
    //given
    int numberA = 3;
    int numberB = 6;
    int expectedResult = 9;

    //when
    int result = Calculator.sum(numberA, numberB);

    //then
    Assertions.assertEquals(expectedResult, result);

  }

}