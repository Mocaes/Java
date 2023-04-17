package array;
import java.util.Random;

public class ejercicioarray9 {
    public static void main(String[] args) {
    Random rand = new Random();
    int media=0,resultado=0;
        int[][] numeros= new int[10][10];
        for(int i=0; i<10;i++){
            for(int a=0;a<10;a++){
                numeros[i][a] =rand.nextInt(101) + 200; 
                System.out.print(numeros[i][a]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<10; i++){
            System.out.print(numeros[i][i] + " ");
            media=media+numeros[i][i];
        }
        resultado=media/10;
        System.out.println("La media de estos 10 numeros es " + resultado);
    }
}
