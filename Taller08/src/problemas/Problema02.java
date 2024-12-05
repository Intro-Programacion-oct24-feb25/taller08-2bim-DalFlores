/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemas;

/**
 *
 * @author utpl
 */
public class Problema02 {
    public static void main(String[] args) {
        double fahrenheit = 20;
        double incremento = 4;
        double acumulador = 0;


        for (int i = 0; i <= 20; i++) {
            double celsius = (fahrenheit - 32) * 5 / 9;
            acumulador += celsius;

            System.out.printf("Operación(%d) Fahrenheit: %.2f ===> "
                    + "Celsius: %.2f\n", i, fahrenheit, celsius);

            fahrenheit = fahrenheit + incremento;
        }

        System.out.println("\nAcumulador de Celsius: " + acumulador);
    }
}