package org.example.ex_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator cl;

    @BeforeEach
    public void setUp(){
        cl = new Calculator();
    }


    @Test
    public void testAddPositives() {
        assertEquals(4, cl.add(2,2));
        assertEquals(150, cl.add(100,50));
    }

    @Test
    public void testAddNegatives() {
        assertEquals(0, cl.add(10,-10));
        assertEquals(-150, cl.add(50,-200));
    }

    @Test
    public void testAddZero() {
        assertEquals(0, cl.add(0,0));
        assertEquals(10, cl.add(0,10));
        assertEquals(5, cl.add(5,0));
    }

    @Test
    public void testDividePositives(){
        assertEquals(10,cl.divide(100,10));
        assertEquals(2,cl.divide(8,4));
    }

    @Test
    public void testDivideNegatives(){
        assertEquals(-2,cl.divide(-20,10));
        assertEquals(-50,cl.divide(100,-2));
    }

    @Test
    public void testDivideByZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            cl.divide(10, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            cl.divide(0, 0);
        });
    }


}