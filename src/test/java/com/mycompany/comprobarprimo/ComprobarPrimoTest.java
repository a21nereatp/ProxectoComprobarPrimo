/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.comprobarprimo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ComprobarPrimoTest {
    
    public ComprobarPrimoTest() {
    }

    @Test
    public void testEPrimo1() {
        System.out.println("non é primo");
        ComprobarPrimo instance = new ComprobarPrimo(6);
        boolean expResult = false;
        boolean result = instance.ePrimo();
        assertEquals(expResult, result);
    }
    @Test
    public void testEPrimo2() {
        System.out.println("primo");
        ComprobarPrimo instance = new ComprobarPrimo(7);
        boolean expResult = true;
        boolean result = instance.ePrimo();
        assertEquals(expResult, result);
    }
    @Test
    public void testEPrimo3() {
        System.out.println("primo");
        ComprobarPrimo instance = new ComprobarPrimo(5);
        boolean expResult = true;
        boolean result = instance.ePrimo();
        assertEquals(expResult, result);
    }
}
