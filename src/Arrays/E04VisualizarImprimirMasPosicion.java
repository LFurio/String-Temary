/*
4. Escribe un programa que permita introducir vector numérico de diez elementos,
    visualizarlo y luego visualizar los elementos cuyo contenido sea par, indicando su posición.	
    Repetir para impar
 */

package Arrays;

public class E04VisualizarImprimirMasPosicion {
    public static void main(String[] args) {
        
        double[] numeros = new double[10];
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=Math.random()*10;
            System.out.println((int)numeros[i]);
        }
        
        //PARES.
        System.out.println("\nNúmeros que son pares dentro del array: ");
        for(int i=0; i<numeros.length; i++){
            if(((int)numeros[i]%2)==0)
                System.out.println("Valor: "+(int)numeros[i]+". Posición: "+i);
        }
        
        //IMPARES.
        System.out.println("\nNúmeros que son impares dentro del array: ");
        for(int i=0; i<numeros.length; i++){
            if(((int)numeros[i]%2)!=0)
                System.out.println("Valor: "+(int)numeros[i]+". Posición: "+i);
        }
        
        
    }
}
