package array;

public class ejercicioarray3 {
    public static void main(String[] args) {
       //Creo los arrays numero, cuadrado ,cubo
       int[] num = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
       double[] cubo = new double[21];
       double[] cuadrado =new double[21];
       //Creo dos bucles para crear los cubos y los cuadrados de cada numero y luego en el mismo bucle creamos la tabla
       for (int i=0; i<20;i++){
        
        cuadrado[i] = Math.pow(num[i], 2) ;

        cubo[i] = Math.pow(num[i], 3);

        System.out.println("Array "+ i + "El numero " + num[i] +" su elevado al cuadrado " + cuadrado[i] + "su elevado al cubo " + cubo[i]);

       }
    }
    
}
