package com.example.legacy;


import junit.framework.TestCase;


public class CalculatorTest extends TestCase {


public void testAdd() {
Calculator calc = new Calculator();
assertEquals(5, calc.add(2, 3));
}


public void testSubtract() {
Calculator calc = new Calculator();
assertEquals(1, calc.subtract(3, 2));
}
}
