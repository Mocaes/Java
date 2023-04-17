package array;

public class pruebarray {
    public static void main(String[] args) {
    int[] n; //se define n como un array de enteros
    n = new int[4]; //se reserva espacio para 4 entero
    n[0] =26;
    n[1] =-30;    
    n[2] =0;
    n[3] =100;
    System.out.println("Los valores del array n son los siguientes");
    System.out.print(n[0] + "," + n[1] + "," + n[2] + "," + n[3]);

    int suma = n[0] + n[3];
    System.out.println("\nEl primer elemento del array más el ultimo suman"+suma);
    
    }
    
}
