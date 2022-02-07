/*
2. Escribe un programa que permita introducir un vector de diez elementos alfanuméricos
    y luego visualizar los que ocupen la posición par.	
    Repetir para los de posición impar.
 */

package Arrays_Vectores;

import java.util.Scanner;

public class E02AlfanumericosParImpar {
    public static void main(String[] args) {
        
        String[] alfanum = new String[10];
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce 10 elementos alfanuméricos.");
        for(int i=0; i<alfanum.length; i++){
            alfanum[i]=leer.nextLine();
        }
        
        //POSICIONES PARES.
        System.out.println("\nLos elementos de las posiciones pares son:");
        for(int i=0; i<alfanum.length; i+=2){
            System.out.println(alfanum[i]);
        }
        
        System.out.println("\nLos elementos de las posiciones pares son:");
        for(int i=0; i<alfanum.length; i++){
            if(i%2==0)
                System.out.println(alfanum[i]);
        }
        
        //POSICIONES IMPARES.
        System.out.println("\nLos elementos de las posiciones impares son:");
        for(int i=1; i<alfanum.length; i+=2){
            System.out.println(alfanum[i]);
        }
        
        System.out.println("\nLos elementos de las posiciones impares son:");
        for(int i=0; i<alfanum.length; i++){
            if(i%2!=0)
                System.out.println(alfanum[i]);
        }
    }
}
