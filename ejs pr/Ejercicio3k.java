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
public class Ejercicio3k {
    private static final String MSG_1 = "Introduece un numero";
    private static final String MSG_2 = "Introduce otro numero: ";
    private static final String MSG_3 = "El numero es múltiple del otro";
    private static final String MSG_4 = "El numero no es múltiple ";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sr.nextInt();
        System.out.println(MSG_2);
        num2 = sr.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_4);
        }
        if (num2 % num1 == 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_4);
        }
    }
}

