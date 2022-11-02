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

public class Ejercicio8 {
    private static final int EX = 0; 
    private static final String MSG_1 = "Pon un numero: "; 
    private static final String MSG_2 = "El numero es este: "; 
    private static final String MSG_3 = "Se acabó "; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1; 
        while (num != EX) { 
            do { 
                System.out.println(MSG_1); 
                num = sc.nextInt(); 
            } while (num < EX); 
            System.out.println(MSG_2 + num);

        }
        System.out.println(MSG_3);
    }

}
