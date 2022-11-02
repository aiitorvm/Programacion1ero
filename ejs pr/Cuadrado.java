/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosentregar;
import java.util.Scanner;

public class Cuadrado{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = 0;
        System.out.println("Pon el tamaño del cuadrado: ");
        tamaño = sc.nextInt();
        
        for(int i = 1; i<= tamaño; i++){
            for(int j = 1; j<= tamaño; j++){
                if(j == 1 || j == tamaño || i == 1 || i == tamaño){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}