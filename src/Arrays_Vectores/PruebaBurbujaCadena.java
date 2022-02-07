/*
Ordenar un vector de cadenas mediante el metodo de la burbuja.
 */

package Arrays_Vectores;

import java.util.Arrays;

public class PruebaBurbujaCadena {
    public static void main(String[] args) {
        
        boolean orden=false;
        
        String cadena[] = {"anita", "ana", "angeles", "angel"}; //length = 4
        
        //System.out.println(cadena[0]);
        //System.out.println(cadena[0].charAt(0));
        
        int i=0;
        
        while(i<cadena.length && orden==false){
            
            for(int j=0; j<cadena.length-1; j++){
                
                orden=true;
                
                if(cadena[j].compareTo(cadena[j+1])>0 && i<cadena.length-1){
                    
                    String aux=cadena[i+1];
                    cadena[i+1]=cadena[i];
                    cadena[i]=aux;
                    orden=false;
                    
                }
                          
            }
            
            System.out.println(Arrays.toString(cadena)+"\n");
            
            i++;
    
        }
    }
}
