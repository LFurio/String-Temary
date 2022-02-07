/*
5. Tenemos dos matrices con la siguiente información.

A(100,2)		 Nº de Producto      Precio
B (50,2)		 Nº de Producto      Cantidad

Tenemos que realizar el siguiente listado:

Nº de Producto	Cantidad    Precio     Importe
xxx		 xx,xxx     xxx.xx     xx,xxx.xx
xxx		 xx,xxx     xxx.xx     xx,xxx.xx

               	 TOTAL	.......... xxx,xxx.xx

Hay que localizar los productos de B en A y efectuar dicho listado.
La matriz A no está ordenada.
 */

package Arrays_Matrices;


public class E05_PedidoFactura {
    public static void main(String[] args) {
        
        double rand;
        int ent;
        final int NumProducto=10;
        
        //Vector No Repetir Número Producto
        int vector[] = new int [NumProducto];
        
        
        //Matriz Precio de productos.
        int stock[][] = new int [NumProducto][2];
        
        System.out.println(" Nº Producto  Precio   (A)");
        
        for(int i=0; i<stock.length; i++){
            for(int j=0; j<stock[i].length; j++){
                
                if(j==0){
                    stock[i][j]=CreaNumero(vector, stock, NumProducto);
                    System.out.print("\t"+stock[i][j]);
                }else{
                    rand=(Math.random()*NumProducto);
                    ent=(int)Math.floor(rand);
                    stock[i][j]=ent;
                    System.out.print("\t"+stock[i][j]);  
                }
                
                
            }
            System.out.println("");    
        }
        
        System.out.println("");
        
        //Matriz Stock del producto.
        int precio[][] = new int [5][2];
        
        System.out.println(" Nº Producto  Cantidad   (B)");
        
        for(int i=0; i<precio.length; i++){
            for(int j=0; j<precio[i].length; j++){
                
                rand=(Math.random()*10)+1;
                ent=(int)Math.floor(rand);
                precio[i][j]=ent;
                System.out.print("\t"+precio[i][j]);
                
            }
            System.out.println(""); 
        }
     
        
    }
    
    static int CreaNumero(int[]vector, int[][] matriz, int NumProducto){
        
        double rand;
        int i;
        
        do{
            rand=(Math.random()*NumProducto);
            i=(int)Math.floor(rand);
            if(vector[i]<0)
                vector[i]=i;
        }while(vector[i]<0);
        
        return i;
        
    }
    
    
}
