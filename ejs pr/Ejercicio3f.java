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

public class Ejercicio3f {
    private static final String MSG_1 = "Introduece un numero: ";
    private static final String MSG_2 = "Es mas grande que 15: ";
    private static final String MSG_3 = "Es mas pequeño que 15: ";
    public static void main(String[] args) {
        float num1, num2;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
            if(num1 / num2 > 15){
                System.out.println(MSG_2);
            }
            else {
                System.out.println(MSG_3);
            }           
  }
} 

