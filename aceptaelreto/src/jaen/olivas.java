/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaen;
import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class olivas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Inviertiendo en Jaen");
        do{
            int maximo=0;
            int filas = sc.nextInt();
            int columnas = sc.nextInt();
            char[][] campo = new char[filas][columnas];
            sc.nextLine();

            for(int i=0;i<filas;i++)
                campo[i]=sc.nextLine().toCharArray();
            MostrarCampo(campo);
            
            
        } while(sc.hasNext());
    }
        
    private static int Zonas(char[][] m,int i,int j, int z){
        if(m[i][j]=='*')
            return 0;
        if(m[i][j]==' '){       // se ha encontrado una zona en blanco: 
            return 0;
        }
        if(m[i][j]=='#'){        // se ha encontrado un campo. hay que mirar alrededor si tambien hay campos
            if(m[i][j+1]=='#'){
                m[i][j+1]='*';
                return z+Zonas(m,i,j+1,z);
            }
            if(m[i][j-1]=='#')
                return z+Zonas(m,i,j-1,z);
            if(m[i+1][j]=='#')
                return z+Zonas(m,i+1,j,z);
            if(m[i-1][j]=='#')
                return z+Zonas(m,i-1,j,z);
        }
    }
    
    private static void MostrarCampo(char[][] m){
        System.out.println("ER MAPA, EA!!");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
