/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprobarprimo;

/**
 *
 * @author Usuario
 */
public class ComprobarPrimo {
    private int numero;
 
    public ComprobarPrimo(int numero) {
        this.numero = numero;
    }
 
    public boolean ePrimo() {
        for (int n = 2; n * n < numero; n++) {
            if (numero % n == 0) {
                return false;
            }
        }
        return true;
    }
}    