/*
1.Introduce una matriz de 5 filas y 7 columnas y a continuación visualiza:
  ◦ Toda la matriz
  ◦ La fila cinco completa
  ◦ El elemento de la cuarta fila tercera columna y el elemento de la quinta fila
        tercera columna. Intercambiarlos el contenido de estos dos elementos y
        visualizarlos de nuevo
  ◦ La primera columna y la cuarta. Intercambiar el contenido de estas columnas
        y visualizarlas de nuevo
 */

package Arrays_Matrices;

import java.util.Arrays;

public class E01_Matriz57 {
    public static void main(String[] args) {
        
        int matriz[][] = new int[5][7];
        
        int filaimprimir=5, aux;
        
        //Imprimir la matriz.
        creaimprime(matriz);
        
        //Imprimir una fila de la matriz.
        imprimefila(matriz, filaimprimir);
        
        
        System.out.println("Intercambiar el elemento de la cuarta fila tercera columna y el elemento de la quinta fila tercera columna.");
        aux=matriz[3][3];
        matriz[3][3]=matriz[4][3];
        matriz[4][3]=aux;
        
        for(int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[i].length; j++){
                
                System.out.print(matriz[i][j]+"   ");
            }
            
            System.out.println();
        }
        
        
        
    }
    
    static void creaimprime(int[][] matriz){
        
        int cuenta=10;
        
        for(int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[i].length; j++){
                
                matriz[i][j]=1+cuenta;
                System.out.print(matriz[i][j]+"   ");
                cuenta++;
            }
            
            System.out.println();
            //System.out.println(Arrays.toString(matriz[i])+"\t");   
        }
    }
    
    static void imprimefila(int[][] matriz, int fila){
        
        if((fila-1)<0 || (fila-1)>=matriz.length){
            System.out.println("Error. La fila "+fila+" no existe.");
        }else{
            System.out.println("La fila "+fila+" es:");
            System.out.println(Arrays.toString(matriz[fila-1]));
        }
        
         
    }
    
    //Para intercambiar las filas, o algun número de celda, usar una variable auxiliar para realizar el cambio.
    
}
