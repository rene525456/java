import java.util.*;
 public class SumaMatrices{
     public static void main (String[]Args){
        int matriza[][] = new int[4][4];
        
        // generar la matriz matemáticamente
        int numero = 0;
    	for (int i=0;i<matriza.length;i++){
            for (int j=0;j<matriza[i].length;j++) {
                numero = numero + 2;
                matriza[i][j] = numero;
            }   
        }
        
	    System.out.println("Matriz resultante de la suma :");
    	for (int i=0;i<matriza.length;i++){
            for (int j=0;j<matriza[i].length;j++) {
                System.out.print(matriza[i][j] + " ");
            }
            System.out.println("");  
        }
    }
}