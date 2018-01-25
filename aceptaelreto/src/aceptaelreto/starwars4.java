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
public class starwars4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0=-1, y0=-1;
        int xn=-1, yn=-1;
        do {
            System.out.println("Filas: ");
            int filas = sc.nextInt();
            System.out.println("Columnas: ");
            int colum = sc.nextInt();
            sc.nextLine();
            char campo[][] = new char[filas][colum];
            for (int x=0;x<filas-1;x++){
                System.out.println("Entrar linea " + x + ": ");
                String linea = sc.nextLine();
                for(int y=0;y<colum-1;y++){
                    //System.out.println(campo[x][y]);
                    campo[x][y]=linea.charAt(y);
                    if(campo[x][y]=='F'){
                        xn=x;
                        yn=y;
                    }
                    if(campo[x][y]=='S'){
                        x0=x;
                        y0=y;
                    }
                }
            }
            ImprimeMapa(campo);
            if(hayCamino(campo,xn,yn))
                System.out.print("SI");
            else
                System.out.print("NO");
        } while (sc.hasNext());
        
        sc.close();
    }
    
    public static boolean hayCamino(char[][] matriz, int i, int j) {
        //determina si hay camino entre inicio (x0,y0) y final(xn,yn)
        boolean salida;
        
        if(matriz[i][j]=='F')
            return true;
        else if(matriz[i][j]=='*')
            return false;
            
        
        if(i>0){
            if(i<matriz.length){
                if(j<matriz[i].length)
                    return hayCamino(matriz,i,j+1);
                else
                    return hayCamino(matriz,i,j-1);
            } else {
                if(j<matriz[i].length)
                    return hayCamino(matriz)
            }
        }
        return salida;
    }
    
    public static void ImprimeMapa(char[][] mapa) {
        for(int i=0;i<mapa.length-1;i++){
            for (int j=0;j<mapa[i].length-1;j++) {
                System.out.print("" + mapa[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
