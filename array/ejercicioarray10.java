package array;
import java.util.Random;
public class ejercicioarray10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int media=0,resultado=0;
            int[][] numeros= new int[10][10];
            for(int i=0; i<9;i++){
                for(int a=0;a<9;a++){
                    numeros[i][a] =rand.nextInt(500) + 400; 
                    System.out.print(numeros[i][a]+" ");
                }
                System.out.println();
            }
            System.out.println();
            for(int i=8;i>-1; i--){
                System.out.print(numeros[i][i] + " ");
                media=media+numeros[i][i];
            }
            resultado=media/10;
            System.out.println("La media de estos 10 numeros es " + resultado);
    }
    
}
