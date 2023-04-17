package array;
import java.util.Scanner;

public class ejercicioarray2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Creo del objeto num 11 arrays sin ningun valor dado
        int[] num = new int[11];
        //Coloco un bucle para que de valor a los 10 array
        for(int i=0; i <= 10; i++){
            System.out.println("Porfavor coloque el numero para el array numero " + i);
            num[i] = s.nextInt();
        }
        //Coloco otro bucle a la inversa ya que pedia que saliesen de 10 al 0

        for(int i=10;i >=0; i--){
            System.out.println("este array es el " + i + " y vale "+ num[i]);
        }
        s.close();
    }
    
}
