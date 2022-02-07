/*
1. Escribe un programa que solicite tres cadenas de caracteres, una llamada nombre, 
otra llamada primerApellido y segundoApellido. El programa debe  crear una cadena con
el nombre completo y después mostrar por pantalla:
   ◦ el nombre completo  con todos los caracteres en minúsculas y luego en mayúsculas y su longitud.
   ◦ los dos primeros caracteres de la cadena (solo en el caso de que la longitud de esta sea de dos o más caracteres). --> substring
   ◦ los dos últimos caracteres de la cadena (solo en el caso de que la longitud de esta sea de dos o más caracteres).  --> substring
   ◦ el número de ocurrencias(veces que aparece) en la cadena del último carácter. --> indexOf (si no lo encuentra devuelve -1)
   ◦ la cadena con todas las ocurrencias del primer carácter en mayúsculas.
   ◦ la cadena con tres asteriscos por delante y por detrás.
   ◦ la cadena invertida.
 */

package Arrays_Strings;

import java.util.Scanner;

public class E01NombreApellidos {
    
    //Método Minúsculas.
    static String Minus(String nombretotal){
        
        String minus = nombretotal.toLowerCase();
        
        return minus;
    }
    
    //Método Mayúsculas.
    static String Mayus(String nombretotal){
        
        String mayus = nombretotal.toUpperCase();
        
        return mayus;
    }
    
    //Método Longitud.
    static int Longitud(String nombretotal){
        
        int longitud = nombretotal.length();
        
        return longitud;        
    }
    
    //Dos Primeros Carácteres.
    static String DosCarInicial(String completo){
        
        String dos = completo.substring(0, 2);
        String none = "";
        
        if(completo.length()>1)
            return dos;
        else
            return none;
    }
    
    //Dos Últimos Carácteres.
    static String DosCarUltimo(String completo){
        
        int inicio=completo.length()-2, fin=completo.length();
        String dos = completo.substring(inicio, fin);
        String none = "";
        
        if(completo.length()>1)
            return dos;
        else
            return none;
    }
    
    //Ocurrencias del último carácter.
    static int OcurUltCar(String completo){
        
        char ultimo;
        int veces=0, i=0;
        
        ultimo = completo.charAt(completo.length()-1);
        
        while((i = completo.indexOf(ultimo, i)) != -1){
            veces++;
            i++;
        }
        
        return veces;
        
    } 
    
    //Ocurrencias del primer carácter en mayúsculas.
    static String PrimerOcurMayus(String completo){
        
        char primer=completo.charAt(0), primermayus=Character.toUpperCase(primer);
        String result;
        
        result=completo.replace(primer, primermayus);
        
        return result;
        
    }
    
    
    
    public static void main(String[] args) {
        
        String nombre="", primerapellido="", segundoapellido="", completo="", dosinicial="", dosultimo="", primercarmayus="", invertida="";
        int length, ultimochar;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        nombre=leer.nextLine();
        
        System.out.print("Introduce tu primer apellido: ");
        primerapellido=leer.nextLine();
        
        System.out.print("Introduce tu segundo apellido: ");
        segundoapellido=leer.nextLine();
        
        completo=nombre+" "+primerapellido+" "+segundoapellido;
        
        //Nombre en Minúsculas.
        System.out.println("Nombre en minúsculas: "+Minus(completo));
        
        //Nombre en Mayúsculas.
        System.out.println("Nombre en mayúsculas: "+Mayus(completo));
        
        //Longitud del nombre.
        length=Longitud(completo);
        System.out.println("La longitud del nombre con espacios es de: "+length+" carácteres. Y sin espacios es de: "+(length-2)+" carácteres.");
        
        //Dos Carácteres Iniciales.
        dosinicial=DosCarInicial(nombre)+DosCarInicial(primerapellido)+DosCarInicial(segundoapellido);
        System.out.println("Las dos primeras letras de cada nombre y apellido: "+dosinicial);
        
        //Dos Carácteres Últimos.
        dosultimo=DosCarUltimo(nombre)+DosCarUltimo(primerapellido)+DosCarUltimo(segundoapellido);
        System.out.println("Las dos últimas letras de cada nombre y apellido: "+dosultimo);
        
        //Ocurrencias del último carácter.
        ultimochar=OcurUltCar(completo);
        System.out.println("El número de veces que se repite el carácter: "+completo.charAt(completo.length()-1)+" --> en el nombre completo es: "+ultimochar+".");
        
        //Ocurrencias primer carácter en mayúsculas.
        primercarmayus=PrimerOcurMayus(completo);
        System.out.println("El primer carácter en mayusculas: "+primercarmayus);
        
        //Tres asteriscos delante y tres detrás.
        System.out.println("Con asteriscos: "+"*** "+completo+" ***.");
        
        //Cadena invertida.
        for(int i=completo.length()-1; i>=0; i--){
            invertida=invertida+completo.charAt(i);
        }
        System.out.println("La cadena invertida es: "+invertida);
        
    }
}
