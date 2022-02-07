/*
7. Escribe un programa que permita  introducir un vector de 50 elementos numéricos
    e indique luego cual es el primer elemento cuyo contenido sea cero. Si no lo
    hubiera, debe indicarlo.
 */

package Arrays_Vectores;



public class E07SaltaCero {
    public static void main(String[] args) {
        
        int vector[] = new int[50];
        int numero=0, posicion;
        
        almacena(vector);
        
        muestra(vector);
        
        posicion=posicion(vector,numero);
            
        System.out.println("Valor: "+numero+" --> Posición: "+posicion);
    }
    
    //Almacena datos.
    static void almacena(int[] vector){
        
        double rand;
        int ent;
        
        for(int i=0; i<vector.length; i++){
            rand=Math.random()*50;
            ent=(int)Math.floor(rand);
            vector[i]=ent;
        }
    }
    
    //Muestra datos.
    static void muestra(int[] vector){
        
        int cuenta=0;
        
        for(int i:vector){
            System.out.print(i+"\t");
            cuenta++;
            if(cuenta%5==0)
                System.out.print("\n");
        }
    }
    
    //Devuelve la posición del primer 0.
    static int posicion(int[] vector, int numero){
        
        int posicion=0;
        boolean cero=false;
        
        do{
            if((vector[posicion])==0)
                    cero=true;
            posicion++;
        }while(posicion<=vector.length && cero==false);
        
        return posicion;
        
    }
}