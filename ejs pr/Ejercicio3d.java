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

public class Ejercicio3d {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "Si està ";
    private static final String MSG_3 = "No està ";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num  >= -3 && num < 28 ){
            System.out.println(MSG_2);
        }else
            System.out.println(MSG_3);
    }
}