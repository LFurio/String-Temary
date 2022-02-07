/*
Crear un vector de tamaño maximo 10 elementos enteros introducidos por el usuario
que esten ordenados crecientemente.
 */

package Arrays_Vectores;

import java.util.Scanner;
import java.util.Arrays;

public class PruebaOrdenarCrecientemente {
    public static void main(String[] args) {
        
        int dato, cuenta=10;
        
        Scanner valor = new Scanner(System.in);
        
        int vector[] = new int[10];
        
        System.out.println("Vector de 10 elementos enteros.");
        
        for(int i=0;i<vector.length;i++){
            System.out.println("Quedan "+cuenta+" elementos.");
            cuenta--;
            System.out.println("Inserta número --> ");
            dato=valor.nextInt();
            vector[i]=dato;
            
            
    //--------------------------------------------------------------------------
            if(i>0){
                ordena(vector, i);
            }
            //Imprimir Prueba
            System.out.println(Arrays.toString(vector)+"\n");
            
        }
    }
    
    //Metodo Ordena-------------------------------------------------------------
    static int[] ordena(int[] vector, int i){
        
        int aux;
    
        while(i>0){
            if(vector[i]<vector[i-1]){
                aux=vector[i];
                vector[i]=vector[i-1];
                vector[i-1]=aux;
            }
            i--;
        }
        return vector; 
    }  
}