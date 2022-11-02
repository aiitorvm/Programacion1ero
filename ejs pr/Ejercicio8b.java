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

public class Ejercicio8b {
    private static final String MSG_1 = "Introduce un numero de numeros: ";
    private static final String MSG_2 = "Introduce otro: ";
    private static final String MSG_3 = "Gracias por usarlo. ";
    public static void main(String[] args) {
        int count=0, num, i;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while (count != num){
            System.out.println(MSG_2);
            i = sc.nextInt();
            count++;
        }
        System.out.println(MSG_3);
    }
}

