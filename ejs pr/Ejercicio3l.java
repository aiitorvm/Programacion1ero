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
public class Ejercicio3l {
    private static final int MOD = 6;
    private static final int MIN = 50;
    private static final int MAX = 200;
    private static final String MSG_1 = "Introduce litros de agua";
    private static final String MSG_3 = "El litro cuesta 0,1";
    private static final String MSG_4 = "El litro cuesta 0,3";

    public static void main(String[] args) {
        int litros;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        litros = sr.nextInt();
        
        if (litros >= MIN && litros <= MAX) {
            System.out.println(MSG_3);
        } else if (litros > MAX) {
            System.out.println(MSG_4);
        } else {
            System.out.println("Vale 6");
        }
    }
}

