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
public class problema2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Elementos del vector: ");
        int max = sc.nextInt();
        int[] vector = new int[max];
        for (int i=0;i<max;i++) {
            vector[i] = 1+(int)(Math.random()*10);
            System.out.print("" + vector[i] + "\t");
        }
        System.out.print("\nElemento: ");
        int elem = sc.nextInt();
        sc.close();
        System.out.println("El numero " + elem + " aparece " + Ocurrencia(elem,vector,0,0) + " veces.");

    }
    
    public static int Ocurrencia(int e, int[] v, int p,int q){
        if(p==v.length-1) {
            if (e==v[p])
                return 1;
            else
                return 0;
        } else {
            if (e==v[p])
                return 1+Ocurrencia(e,v,p+1,q);
            else
                return Ocurrencia(e,v,p+1,q);
        }
    }
}
