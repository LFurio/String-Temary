U06.- Cadenas (Strings)
1. Escribe un programa que solicite tres cadenas de caracteres, una llamada nombre,  otra llamada primerApellido y segundoApellido. El programa debe  crear una cadena con el nombre completo y después mostrar por pantalla:
   el nombre completo  con todos los caracteres en minúsculas y luego en mayúsculas y su longitud
   los dos primeros caracteres de la cadena (solo en el caso de que la longitud de esta sea de dos o más caracteres)
   los dos últimos caracteres de la cadena (solo en el caso de que la longitud de esta sea de dos o más caracteres)
   el número de ocurrencias en la cadena del último carácter
   la cadena con todas las ocurrencias del primer carácter en mayúsculas
   la cadena con tres asteriscos por delante  y por detrás
   la cadena invertida
2. Escribe un método que, dado un String, devuelve otro objeto String en el que se cambian todas las vocales minúsculas del original por la letra 'a'.
   Escribe un método que, dada una cadena de caracteres, devuelve la mitad inicial de la cadena. Escribe un programa que pruebe el método con las cadenas “Hola que tal” y “Adiós”.
   Escribe un método que, dada una cadena de caracteres, sustituya todas las ocurrencias del texto “es” por “no por”. Escribe un segundo método que sustituya todos los grupos de dígitos por un único carácter asterisco, es decir, si la cadena de caracteres es “esto1234es5678bueno900” el primer método debe devolver “no porto1234no por5678bueno900” y el segundo debe devolver “esto*es*bueno*”. Escribe el programa que permita comprobar que funciona correctamente.
   Nota: 	La expresión regular \\d+ significa un dígito o más. 					Puedo usar replaceAll( “\\d+” ,  “*” ); 							Más información sobre expresiones regulares en Java:
   http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#sum
   http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java
   Escribe un método que, dada una cadena de caracteres, cuente cuántas veces aparece la misma en dicho texto. Por ejemplo, para la cadena “En un lugar de la mancha, de cuyo nombre no puedo acordarme”, si se cuenta cuántas veces aparece “o ”, o dicho de  otra forma, cuántas palabras acaban en o, debería indicar que son 3.
   Probar su ejecución con la frase:
   “123 … Veamos si esto funciona … 123 probando”
