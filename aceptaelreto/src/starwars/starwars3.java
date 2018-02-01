/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;
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
        while (hangares!=0) {
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
            hangares = sc.nextInt();
        }
        sc.close();
    }
    
    public static boolean ResuelveCaso(int[] h, int[] n) {
        boolean salida=false;
        for (int i=0;i<n.length;i++){
            int hangar = HangarMayor(h);
            if (hangar>=n[i]) {
                h[hangar]=h[hangar]-n[i];
                salida = true;
            } else
                salida=false;
        }
        return salida;
    }
    
    
    public static int HangarMayor(int[] hangar){
        int maximo = -1;
        int posicion =-1;
        for (int i=0;i<hangar.length;i++){
            if (hangar[i]>maximo) {
                maximo=hangar[i];
                posicion = i;
            }
        }
        return posicion;
    }
    
}
