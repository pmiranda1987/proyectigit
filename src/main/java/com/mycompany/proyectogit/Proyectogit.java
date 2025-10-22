/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectogit;
import java.util.Scanner;

public class Proyectogit {

    public static void main(String[] args) {
       Scanner ingreso = new Scanner (System.in);
        int a, b;
        System.out.println("Ingresa el valor de a");
        a=ingreso.nextInt();
        System.out.println("Ingresa el valor de b");
        b=ingreso.nextInt();
        System.out.println("la suma es: "+(a+b));
    }
}
