/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;
import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class starwars3 {
    public static void main(String[] args) {
        int hangares=0, naves=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Problema 3. Organizando los hangares");
        System.out.print("\nHangares: ");
        hangares = sc.nextInt();
        int hangar[] = new int[hangares];
        for (int i=0;i<hangares;i++) {
            hangar[i]=sc.nextInt();
        }
        System.out.print("\nNaves: ");
        naves = sc.nextInt();
        int nave[] = new int[naves];
        for(int i=0;i<naves;i++){
            nave[i]=sc.nextInt();
        }
        
        if(ResuelveCaso(hangar,nave))
            System.out.println("SI");
        else
            System.out.println("NO");
        sc.close();
    }
    
    public static boolean ResuelveCaso(int[] h, int[] n) {
        boolean salida=false;
        for (int i=0;i<n.length;i++){
            int hangar = qHangarMax(h, n[i]);
            if (hangar>=0) {
                h[hangar]=h[hangar]-n[i];
                salida = true;
            } else
                salida=false;
        }
        return salida;
    }
    
    public static int qHangarMax(int[] h, int nave) {
        int salida = -1;
        int maximo=1000000;
        for (int i=0;i<h.length;i++) {
            
        }
        return salida;
    }
    
}
