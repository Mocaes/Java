package array;
import java. util. Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicioarray7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //primero creo el tablero el cual es de 8 x 8;
        int[][] tablero = new int[7][7];
        String[] letras = {"A","B","C","D","E","F","G","H"};
        int [] numeros = {1,2,3,4,5,6,7,8};
        System.out.println("Coloque una letra de la A a la H");
        int columna = s.nextInt();
        System.out.println("Coloque un numero del uno al 8");
        int fila = s.nextInt();
        
        //Coloca el alfil
         for (int i=0;i<7;i++){
            System.out.println();

            for(int a =0; a<7;a++){
                if(i==fila&&a==columna){
                System.out.print(" "+ 1 +" ");
                }else{
              System.out.print(" "+tablero[i][a]+" ");
                }
           }
        
        }
        


    }
}
