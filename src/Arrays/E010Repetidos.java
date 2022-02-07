/*
10. Escribe un programa que permita introducir un vector de veinte elementos, visualizar
    e indicar luego si hay o no algún elemento repetido. En ese caso indicar cuáles son
    y la posición que ocupan.
 */

package Arrays;

public class E010Repetidos {
    public static void main(String[] args) {
        
        double rand;
        int ent;
        
        int vector[] = new int[20];
        
        //Generar el vector.
        for(int i=0; i<vector.length; i++){
            rand=Math.random()*20;
            ent=(int)Math.floor(rand);
            vector[i]=ent;
            System.out.print(vector[i]+" ");
        }
        
        System.out.println("");
        
        //Comprobar repetidos.
        String posicion;
        int cont, cont2, nohayrep=0;
        boolean repet;
        
        for(int i=0; i<vector.length; i++){
            
            posicion="";
            cont=0;
            cont2=0;
            repet=false;
            
            for(int j=i+1;j<vector.length; j++){
                if(vector[i]==vector[j]){
                    cont++;
                    posicion=posicion+j+" ";
                }
            }
            
            while(cont2<i && repet==false){
                if(vector[i]==vector[cont2])
                    repet=true;
                cont2++;
            }
                
            if(cont>0 && repet==false){
                System.out.println("Elemento: "+vector[i]+" --> repetido en las posiciones: "+i+" "+posicion);
                nohayrep++;
            }
            
        }
            
            if(nohayrep==0)
                System.out.println("No hay repetidos.");
            
    }
}
