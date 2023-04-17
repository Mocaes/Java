package array;
import java.util.Arrays;
import java.util.Collections;

public class pruebaarray5 {
    public static void main (String[]args){
    String[] array1 = {"Eva","Laura","Alberto"};
    Arrays.sort(array1);
    System.out.println(Arrays.toString(array1));
    
    System.out.println("Array original: " + Arrays.toString(array1));
    Collections.reverse(Arrays.asList(array1));
    System.out.println("Array revertido: " +  Arrays.toString(array1));

    }
    
}
