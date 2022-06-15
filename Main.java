package com.ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        double precioConIva = getPrecio(precio);
        System.out.println("El precio con IVA 21% es: $" + precioConIva);

    }
    static double getPrecio(double precio) { //IVA en Argentina es 21%
        return precio*1.21;
    }
}