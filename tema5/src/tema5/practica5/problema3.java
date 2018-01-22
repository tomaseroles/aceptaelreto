/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.practica5;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class problema3 {
    public static void main(String[] args){
        System.out.println("Suma de elementos de un vector");
        int orden=0, parcial=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Orden del vector:");
        orden = sc.nextInt();
        int v[] = new int[orden];
        System.out.println("Los elementos del vector son: ");
        for (int i=0;i<orden;i++){
            v[i]=1+(int)(Math.random()*10);
            System.out.print("" + v[i] + "\t");
            parcial+=v[i];
        }
        System.out.println("La suma de comprobación es:  " + parcial);
        System.out.println("La suma de los elementos es: " + SumaVector(v,0,0));
    }
    
    public static int SumaVector(int[] v,int suma, int pos) {
        if (pos<v.length-1)
            suma = v[pos]+SumaVector(v,suma,pos+1);
        else
            suma = v[pos];
        return suma;
    }
}
