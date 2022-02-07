/*
Clase String.
 */

package Arrays_Strings;

public class STRING {

    private String cadena;
    
    
    public STRING(String cadena){
        
        this.cadena = cadena;
        
    }
    
    //Imprimir.
    public void Imprime(){
        
        System.out.println("La cadena introducida es: "+cadena);
        
    }
    
    //Cambiar las vocales por a.
    public String CambiaVocales(){
        
        String frase=cadena;
        
        frase=frase.replace("e", "a");
        frase=frase.replace("i", "a");
        frase=frase.replace("o", "a");
        frase=frase.replace("u", "a");
        
        return frase;
        
    }
    
    //Mitad inicial de la cadena.
    public String MitadCadena(){
        
        String frase=cadena;
        
        return frase.substring(0, (frase.length()/2));
          
    }
    
    //Cambiar "es" por "no por".
    public String CambiaEs(){
        
        String frase=cadena;
        
        return frase.replaceAll("es", "no por");
        
    }
    
    //Cambiar dígitos por asteriscos.
    public String CambiaDigitos(){
        
        String frase=cadena;
        
        return frase.replaceAll("\\d+", "*");
          
    }
    

    
    
}
