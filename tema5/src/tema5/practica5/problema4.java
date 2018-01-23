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
public class problema4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rayuela.");
        System.out.print("Numero de valores: ");
        int n = sc.nextInt();
        System.out.println("El numero de caminos es: " + CaminosPosibles(n));
    }
    
    public static int CaminosPosibles(int valor) {
        if (valor==0)
            return 1;
        else if (valor==1)
            return 2;
        else
            return CaminosPosibles(valor-1)+CaminosPosibles(valor-2);
        
    }
}
