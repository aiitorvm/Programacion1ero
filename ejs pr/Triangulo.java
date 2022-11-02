/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosentregar;

public class Triangulo {
    private static final int filas = 10;
    public static void main(String[] args) {
                
        for (int x = 1; x <= filas; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("* ");
            }
            
            System.out.println("");
        }
    }
}