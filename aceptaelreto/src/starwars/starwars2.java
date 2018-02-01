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
public class starwars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pruebas=0, valor=0, cuatros=0;
        String base5;
        pruebas = sc.nextInt();
        for(int i=0;i<pruebas;i++){
            valor = sc.nextInt();
            base5=Integer.toString(valor, 5);
            if (qCuatro(base5)>1)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
    
    public static int qCuatro(String cad) {
        int salida=0;
        for(int i=0;i<cad.length();i++){
            if (cad.charAt(i)=='4')
                salida++;
        }
        return salida;
    }
    
}
