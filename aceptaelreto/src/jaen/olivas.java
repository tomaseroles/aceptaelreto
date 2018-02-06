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
            int maximo=0, aux=0;
            int filas = sc.nextInt();
            int columnas = sc.nextInt();
            char[][] campo = new char[filas][columnas];
            sc.nextLine();

            for(int i=0;i<filas;i++)
                campo[i]=sc.nextLine().toCharArray();
            //MostrarCampo(campo);
            while(HayOlivos(campo)) {
                aux=Zonas(campo,0,0,maximo);
                if (aux>maximo)
                    maximo=aux;
            }
            System.out.println(maximo);
        } while(sc.hasNext());
    }
        
    private static int Zonas(char[][] m,int i,int j, int z){
        System.out.println(i+"\t"+j+"\t"+m[i][j]);
        
        if(i<0 || i>=m.length || j<0 || j>=m[i].length)
            return 0;
        if(m[i][j]==' ')
            return 0;
        if(m[i][j]=='#'){        // se ha encontrado un campo. hay que mirar alrededor si tambien hay campos
            m[i][j]=' ';
            z++;
            z = z+Zonas(m,i,j+1,z);
            z = z+Zonas(m,i,j-1,z);
            z = z+Zonas(m,i-1,j,z);
            z = z+Zonas(m,i+1,j,z);
            return z;
        }
        return 0;
    }
    
    private static boolean HayOlivos(char[][] m){
        boolean salida=false;
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]=='#')
                    salida=true;
            }
        }
        return salida;
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
