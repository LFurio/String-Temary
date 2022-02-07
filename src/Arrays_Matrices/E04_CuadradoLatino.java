/*
Generar en cuadrado Latino de orden N. (Un cuadrado Latino de orden N es una matriz
cuadrada en la que la primera fila contiene los N primeros números naturales, en orden,
y cada una de las siguientes filas contiene la rotación de la fila anterior un lugar a
la derecha.

1 2 3 4 5
5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
*/

package Arrays_Matrices;

import java.util.Scanner;

public class E04_CuadradoLatino {
    public static void main(String[] args) {
        
        //Introducir el tamaño de la matriz.
        int n;
        
        Scanner N = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz: ");
        n=N.nextInt();
        System.out.print("");

        
        //Crear la matriz.
        int matriz[][]= new int[n][n];
        
        for(int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[i].length; j++){
                
                if(i==0){
                    matriz[i][j]=j+1;
                }
                else if(j==0){
                    matriz[i][j]=matriz[i-1][n-1];
                }
                else{
                    matriz[i][j]=matriz[i-1][j-1];
                }
                
                System.out.print(matriz[i][j]+"\t");   
                
            }
            
            System.out.println("");
 
        }
    }
}

//Puede hacerse con un contador e igualarlo a cero cuando fila y columna coincidan, es decir, al se 1.