/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosentregar;
import java.util.Scanner;

/**
 * Nom: Aitor
 * Cognoms: Va Mejías
 * INS Manuel Vázquez Montalbán
 * Data d’edició: 28/10/2022
 * Nom del cicle formatiu: DAW
 * Nom del mòdul: Programació
 */

public class Ejercicio3j {
    private static final String MSG_1 = "Introduve un numero";
    private static final String MSG_2 = "Introduce otro numero";
    private static final String MSG_3 = "El valor maximo de los dos numero es: ";
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sr.nextInt();
        System.out.println(MSG_2);
        num2 = sr.nextInt();
        System.out.println(MSG_2);
        num3 = sr.nextInt();
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(MSG_3 + num1);
            } else {
                System.out.println(MSG_3 + num3);
            }        
        } else {
            if (num2 > num3) {
            System.out.println(MSG_3 + num2); 
        } else {
            System.out.println(MSG_3 + num3);
        }
    }
    }
} 

