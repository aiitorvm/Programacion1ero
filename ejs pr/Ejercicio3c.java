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

public class Ejercicio3c {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "No es ";
    private static final String MSG_3 = "Si es ";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num > 0 && num < 100 ){
            System.out.println(MSG_3);
        }else
            System.out.println(MSG_2);
    }
}
