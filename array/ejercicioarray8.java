package array;
import java.util.Scanner;
import java.util.Random;
public class ejercicioarray8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] tablero  = new char[3][3];
        System.out.println("Bienvenido al juego del 3 en raya usted sera x");
        System.out.println("Coloque en que casilla quiere colocar su x");
        
        for (int i= 0; i<tablero.length;i++){
            
            for (int a = 0; a<tablero[i].length;a++){
            tablero[i][a] = '.';
            System.out.print( "|" + tablero[i][a] );
                
            }
            System.out.println("|");
        }
        System.out.println(" ");
        System.out.println("Coloque una cordenada para colocar la x");
        int x =s.nextInt();
        int y = s.nextInt();
        tablero[x][y] = 'x';
            
        Random random = new Random();
        int num1 = random.nextInt(2);
        int num2 = random.nextInt(2);
        tablero[num1][num2]= 'O';

        for (int i= 0; i<tablero.length;i++){
            
            for (int a = 0; a<tablero[i].length;a++){
                System.out.print( "|" + tablero[i][a] );
                
            }
            System.out.println("|");
        }
        
    }
    
}
