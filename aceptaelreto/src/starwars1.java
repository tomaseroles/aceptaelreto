/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author tomfor
 */
public class starwars1 {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int numeros;
        numeros = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numeros;i++) {
            String personaje = sc.nextLine();
            String pariente  = sc.nextLine();
            if (personaje.equals("Luke") && (pariente.equals("padre")))
                System.out.println("TOP SECRET");
            else
                System.out.println(personaje + ", yo soy tu " + pariente);
        }
        sc.close();
    }
}
