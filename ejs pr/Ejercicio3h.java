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

public class Ejercicio3h {
    private static final int MOD = 2;
    private static final String MSG_1 = "Introduce un numero";
    private static final String MSG_2 = "El numero al cuadrdao es par ";
    private static final String MSG_3 = "El numero al cuadrado es impar ";

    public static void main(String[] args) {
        int num;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sr.nextInt();

        if (num % MOD == 0) {
            System.out.println(MSG_2 + num * num);
        } else {
            System.out.println(MSG_3 + num * num * num);
        }
    }
}

