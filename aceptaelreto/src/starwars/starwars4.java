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
        //cambiar el codigo para hacer las ifs al reves, para agrupar los pasos iguales
        /* caminos
         * m[][],i,j+1  si(
         * m[][],i+1,j  si(i>=0 y i<max)
         * m[][],i,j-1  
         * m[][],i-1,j  si(i>0 y 
        */ 
        if(i<0 || j<0 || i>matriz.length || j>matriz[i].length || matriz[i][j]=='*')
            return false;
        else if(matriz[i][j]=='F')
            return true;
        else{
            if(matriz[i][j]=='.'){
                matriz[i][j]='*';
                if(hayCamino(matriz,i,j+1))
                    return true;
                if(hayCamino(matriz,i,j-1))
                    return true;
                if(hayCamino(matriz,i+1,j))
                    return true;
                if(hayCamino(matriz,i-1,j))
                    return true;
            }
            
        }
        
        return false;
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
