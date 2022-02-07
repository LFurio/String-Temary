/*
4. Escribe un programa que permita introducir un vector de 20 elementos numéricos y
    visualizarlos de cuatro en cuatro.
 */

package Arrays;

public class E03De4En4 {
    public static void main(String[] args) {
        
        double[] numeros = new double[20];
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=Math.random()*10;
        }      
        
        for(int i=0; i<numeros.length; i+=4){
            System.out.println((int)numeros[i]+" "+(int)numeros[i+1]+" "+(int)numeros[i+2]+" "+(int)numeros[i+3]);
        } 
    }
}
