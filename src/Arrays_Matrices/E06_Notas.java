/*
6. Crea un programa para gestionar las notas de un grupo escolar. El grupo se compone
de 20 alumnos y tiene3 módulos:

    • Calcular la nota media de cada alumno

    • Calcular la máxima nota de cada módulo

    • Calcular la nota media por módulo y cuantos alumnos la sobrepasan
 */

package Arrays_Matrices;

public class E06_Notas {
    public static void main(String[] args) {
        
        double rand;
        int ent, numal=1;
        final String al="Alumno ";
        
        double matriz[][] = new double[20][4];
        
        //Crear la matriz.
        System.out.println("\t\tMod 1\tMod 2\tMod 3");
        
        for(int i=0; i<matriz.length; i++){
            
            System.out.print(al+numal+"\t");
            numal++;
            
            for(int j=0; j<(matriz[i].length-1); j++){
                
            rand=Math.random()*11;
            ent=(int)Math.floor(rand);
            matriz[i][j]=Math.floor(rand);
            System.out.print(matriz[i][j]+"\t");
     
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        
        //Nota media de cada alumno.
//        Media(matriz);
        
        
    }
/*    
    static double Media(double[][] matriz){
        
    
        for(int i=0; i<matriz.length; i++){
            
            for(int j=(matriz[i].length-1); j<matriz[i].length; j++){
                
            rand=Math.random()*11;
            ent=(int)Math.floor(rand);
            matriz[i][j]=Math.floor(rand);
            System.out.print(matriz[i][j]+"\t");
     
            }
            
            System.out.println("");
            
        }
        
        
        return ;
        
    }*/
}
