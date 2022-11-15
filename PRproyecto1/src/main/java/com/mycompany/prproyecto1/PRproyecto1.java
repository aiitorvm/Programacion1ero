/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prproyecto1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PRproyecto1 {

    private final static String MSG_1 = "Id: ";
    private final static String ERROR = "Error\n";
    private final static String MSG_2 = "Has superado el límite de intentos\n";
    private final static String MSG_3 = "Edad: ";
    private final static Integer MIN_ID = 111;
    private final static Integer MAX_ID = 999;
    private final static Integer MIN_EDAD = 14;
    private final static Integer MAX_EDAD = 120;
    private final static Integer NUM_3 = 3;
    private final static String MSG_9 = "Tipo de venta?: \n";
    private final static String MSG_10 = "Venda lliure(0)\n";
    private final static String MSG_11 = "Pensionista(1)\n";
    private final static String MSG_12 = "Carnet jove(2)\n";
    private final static String MSG_13 = "Soci(3)\n";
    private final static String MSG_14 = ": ";
    private final static Integer NUM_0 = 0;
    private final static String MSG_16 = "Importe de la compra?: ";
    private final static Integer NUM_1000 = 1000;
    private final static String MSG_18 = "Teléfono de contacto?: ";
    private final static Integer MIN_TEL = 111111111;
    private final static Integer MAX_TEL = 999999999;
    private final static String MSG_17 = "Id    edad    tipoVenta   coste   telefono\n";

    public static void main(String[] args) {
        int id = 0, edad = 0, tipoVenta = 0, coste = 0, telefono = 0, count = 0;
        boolean isInteger = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(MSG_1);

            isInteger = sc.hasNextInt();
            if (isInteger) {
                id = sc.nextInt();
                if (id < MIN_ID || id > MAX_ID) {
                    System.out.print(ERROR);
                }
            } else {
                System.out.print(ERROR);
                sc.next();

            }
            count++;

        } while ((!isInteger || id < MIN_ID || id > MAX_ID) && count < NUM_3);
       
        /*copiar a parti del if hasta antes del otro if*/
       
        if (count < NUM_3) {
            count = NUM_0;

            do {
                System.out.print(MSG_3);

                isInteger = sc.hasNextInt();
                if (isInteger) {
                    edad = sc.nextInt();
                    if (edad < MIN_EDAD || edad > MAX_EDAD) {
                        System.out.print(ERROR);
                    }
                } else {
                    System.out.print(ERROR);
                    sc.next();

                }
                count++;
            } while ((!isInteger || edad < MIN_EDAD || edad > MAX_EDAD) && count < NUM_3);
        }
       
        if (count < NUM_3) {
            count = NUM_0;

           
           
        switch(tipoVenta) {
            case 0:
                System.out.print(MSG_9);
            case 1:
                System.out.print(MSG_10);
            case 2:
                System.out.print(MSG_11);
            case 3:  
                System.out.print(MSG_12);
            case 4:
                System.out.print(MSG_13);
        }    
           

            do {
                System.out.print(MSG_14);
                isInteger = sc.hasNextInt();
                if (isInteger) {
                    tipoVenta = sc.nextInt();
                    if (tipoVenta < NUM_0 || tipoVenta > NUM_3) {
                        System.out.print(ERROR);
                    }
                } else {
                    System.out.print(ERROR);
                    sc.next();

                }
                count++;
            } while ((!isInteger || tipoVenta < NUM_0 || tipoVenta > NUM_3) && count < NUM_3);
        }
       
        if (count < NUM_3) {
            count = NUM_0;

            do {
                System.out.print(MSG_16);

                isInteger = sc.hasNextInt();
                if (isInteger) {
                    coste = sc.nextInt();
                    if (coste < NUM_0 || coste > NUM_1000) {
                        System.out.print(ERROR);
                    }
                } else {
                    System.out.print(ERROR);
                    sc.next();

                }
                count++;
            } while ((!isInteger || coste < NUM_0 || coste > NUM_1000) && count < NUM_3);
        }
       
        if (count < NUM_3) {
            count = NUM_0;

            do {
                System.out.print(MSG_18);

                isInteger = sc.hasNextInt();
                if (isInteger) {
                    telefono = sc.nextInt();
                    if (telefono < MIN_TEL || telefono > MAX_TEL ) {
                        System.out.print(ERROR);
                    }
                } else {
                    System.out.print(ERROR);
                    sc.next();

                }
                count++;
            } while ((!isInteger || telefono < MIN_TEL || telefono > MAX_TEL ) && count < NUM_3);
        }
       
        if (count < NUM_3) {
            count = NUM_0;
       
        System.out.print(MSG_17);
        System.out.print(id);
        System.out.print("\t");
        System.out.print(edad);
        System.out.print("\t");
        System.out.print(tipoVenta);
        System.out.print("\t");
        System.out.print(coste);
        System.out.print("   \t");
        System.out.print(telefono);
        System.out.print(" \n");
     }
    }
}
