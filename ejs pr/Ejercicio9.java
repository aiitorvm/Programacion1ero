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

public class Ejercicio9 {
    private static final String MSG_1 = "Pon un numero: ";
    private static final String MSG_2 = "Pon otro número: ";
    private static final String MSG_3 = "Imposible hacer la media ";
    private static final String MSG_4 = "La media es de ";
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int num, suma, nums;
        float media; 
        System.out.println(MSG_1);
        num=sc.nextInt();
        suma = 0;
        nums = 0;
        while(num > 0){
            suma += num;
            nums++;
            System.out.println(MSG_2);
            num=sc.nextInt();
        }
        if (nums == 0) 
            System.out.println(MSG_3);
        else {
            media =(float)suma/nums;
            System.out.println(MSG_4 + media);
        }
    }
}

