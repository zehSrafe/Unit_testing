package be.intec.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzLogicTest {
    FizzBuzzLogic logic;

    //runs method with this annotation before any other method
    @BeforeEach
    void init() {
        System.out.println("Running init()...");
        this.logic = new FizzBuzzLogic();
    }

    @Test
    void testDivByThree() {
        String output = logic.parseInput(3);
        assertEquals("Fizz", output);
    }

    @Test
    void testDivByFive() {
        String output = logic.parseInput(5);
        assertEquals("Buzz", output);
    }

    @Test
    void testDivByThreeAndFive() {
        String output = logic.parseInput(15);
        assertEquals("FizzBuzz", output);
    }

    @Test
    void testFailingNumber() {
        String output = logic.parseInput(2);
        assertEquals("You failed to give a number dividable by 3 or 5.", output);
    }
}