package array;

public class ejercicioarray1 {
    public static void main(String[] args) {
        //Creo el array hasta el numero 12 y le asigno valores a los arrays pedidos
        int[] num = new int[12];
        num[0]=39;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;
        //Creo un bucle para que salgan los array hasta el 11 los arrays a los que no le he asignado un valor se les asigna 0
        for(int i=0;i < 11;i++){
            System.out.println("array " + num[i]);
        }

    }
    
}
