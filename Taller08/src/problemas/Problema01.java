/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemas;

/**
 *
 * @author utpl
 */
public class Problema01 {

    public static void main(String[] args) {
        
        int operacion;
        String cadena = "";
        for (int i = 30; i >= 10; i--) {
            cadena = String.format("%s%d", cadena,i);
            for (int o = 2; o <= 4; o++) {
                operacion = i * o;
                cadena = String.format("%s-%d", cadena,
                         operacion);
            }
            cadena = String.format("%s\n", cadena);
        }
         System.out.printf("%s\n", cadena);
    }
}