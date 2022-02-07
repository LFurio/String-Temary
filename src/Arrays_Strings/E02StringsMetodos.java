/*
2.Escribe un método que, dado un String, devuelve otro objeto String en el que se
    cambian todas las vocales minúsculas del original por la letra 'a'. 

  Escribe un método que, dada una cadena de caracteres, devuelve la mitad inicial
    de la cadena. Escribe un programa que pruebe el método con las cadenas “Hola que tal” y “Adiós”.

  Escribe un método que, dada una cadena de caracteres, sustituya todas las ocurrencias
    del texto “es” por “no por”.

  Escribe un segundo método que sustituya todos los grupos de dígitos por un único
    carácter asterisco, es decir, si la cadena de caracteres es “esto1234es5678bueno900” el
    primer método debe devolver “no porto1234no por5678bueno900” y el segundo debe
    devolver “esto*es*bueno*”. Escribe el programa que permita comprobar que funciona correctamente.

  Escribe un método que, dada una cadena de caracteres, cuente cuántas veces aparece
    la misma en dicho texto. Por ejemplo, para la cadena “En un lugar de la mancha, de
    cuyo nombre no puedo acordarme”, si se cuenta cuántas veces aparece “o ”, o dicho de
    otra forma, cuántas palabras acaban en o, debería indicar que son 3.
       Probar su ejecución con la frase:
       “123 … Veamos si esto funciona … 123 probando”
 */

package Arrays_Strings;

import java.util.Scanner;

public class E02StringsMetodos {
    
    public static void main(String[] args) {
   
        String frase, vocales="", mitadinicial="", cambiaes="", asteriscos="", juntos="";
    
        Scanner leer = new Scanner(System.in);
    
        do{
            System.out.println("Introduce una cadena:");
            frase=leer.nextLine();
            if(frase.length()<1)
                System.out.println("No válida.");
        }while(frase.length()<1);
    
    
        STRING cadena = new STRING(frase);
        
        //Impprimir la cadena.
        cadena.Imprime();
        
        //Cambiar vocales por a.
        vocales=cadena.CambiaVocales();
        System.out.println("La cadena solo con 'a' es: "+vocales);
        
        //Mitad inicial de la cadena.
        mitadinicial=cadena.MitadCadena();
        System.out.println("La mitad inicial de la cadena es: "+mitadinicial);
        
        //Cambiar "es" por "no por".
        cambiaes=cadena.CambiaEs();
        System.out.println("Cambiar 'es' por 'no por' da: "+cambiaes);
        
        //Cambiar dígitos por asteriscos.
        asteriscos=cadena.CambiaDigitos();
        System.out.println("Cambiar los grupos de dígitos por un asterisco: "+asteriscos);
        
       
        
        
        
    }
}
