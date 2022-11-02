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

public class Ejercicio5 {
    private static final String MSG_1 = "Pon un año: ";
    private static final String MSG_2 = "Es bisiesto";
    private static final String MSG_3 = "No es bisiesto";
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println(MSG_1);
        int año = sn.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)) {
        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}

