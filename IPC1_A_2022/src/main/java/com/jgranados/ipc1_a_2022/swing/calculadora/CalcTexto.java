package com.jgranados.ipc1_a_2022.swing.calculadora;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class CalcTexto {

    public void mostrar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese numero 1");
        int num1 = scanner.nextInt();
        System.out.println("ingrese numero 2");
        int num2 = scanner.nextInt();
        
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. mmulti");
        System.out.println("4. div");
        int op = scanner.nextInt();
        
        switch (op) {
            case 1:
                Operacion suma = new Suma(num1, num2);
                System.out.println("El resultado es " + suma.operar());
                break;
            case 2:
                Operacion resta = new Resta(num1, num2);
                System.out.println("El resultado es " + resta.operar());
                break;
            case 3:
                Operacion multi = new Multiplicacion(num1, num2);
                System.out.println("El resultado es " + multi.operar());
                break;
            case 4:
                Operacion div = new Division(num1, num2);
                System.out.println("El resultado es " + div.operar());
                break;
            default:
                throw new AssertionError();
        }
    }
}
