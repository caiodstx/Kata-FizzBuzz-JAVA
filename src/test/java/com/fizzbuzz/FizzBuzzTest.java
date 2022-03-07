package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void numDivBy3_returnFizz() {
        // Given
        String expected = "Fizz";
        // When
        String actual = fizzBuzz.check(3);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void numDivBy5_returnBuzz() {
        // Given
        String expected = "Buzz";
        // When
        String actual = fizzBuzz.check(5);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void numDivBy3and5_returnFizzBuzz() {
        // Given
        String expected = "FizzBuzz";
        // When
        String actual = fizzBuzz.check(15);
        // Then
        assertEquals(expected, actual);
    }
}
