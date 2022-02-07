/*
1. Escribe un programa que permita introducir los valores de un vector de diez
    elementos numéricos y luego imprimirlos.
 */

package Arrays;

import java.util.Scanner;

public class E01Numericos {
    public static void main(String[] args) {
        
        
        double[] numeros = new double[10];
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=Math.random()*10;
            System.out.println((int)numeros[i]);
        }
        
        //---------------------------------------------------------------------
        
        
        int num;
        
        int[] numero = new int[10];
        
        Scanner valor = new Scanner(System.in);
        
        for(int i=0; i<numero.length; i++){
            System.out.println("Introduce un entero:");
            num = valor.nextInt();
            numero[i]=num;
        }
        
        for(int leer: numero){
            System.out.println(leer);
        }
        
    }
}
