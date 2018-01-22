/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.practica5;
import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elementos del vector: ");
        int max = sc.nextInt();
        int[] vector1 = new int[max];
        int[] vector2 = new int[max];
        for (int i=0;i<max;i++){
            vector1[i] = 1+(int)(Math.random()*10);
            vector2[i] = 1+(int)(Math.random()*10);
        }
        sc.close();
        System.out.println("v1\tv2");
        if (SonIguales(vector1,vector2,0))
            System.out.println("Los vectores son iguales.");
        else
            System.out.println("Los vectores NO son iguales");
    }
    
    public static boolean SonIguales(int[] v1, int[] v2, int i){
        System.out.println("" + v1[i] + "\t" + v2[i]);
        if (i==v1.length-1)  {
            return (v1[i]==v2[i]);
        } else {
            return SonIguales(v1,v2,i+1);
        }
    }
}
