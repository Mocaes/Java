package array;

public class puebrarray4 {
    public static void main(String[] args){
        int[] Notas = new int[7];
    Notas[0] = 3;
    Notas[1] = 7;
    Notas[2] = 8;
    Notas[3] = 9;
    Notas[4] = 10;
    Notas[5] = 5;
        String[] Asignatura = new String[7];
    Asignatura[0] = "Sistemas";
    Asignatura[1] = "Base de datos";
    Asignatura[2] = "Programacion";
    Asignatura[3] = "Lenguaje de marcas";
    Asignatura[4] = "Entornos de desarrollo";
    Asignatura[5] = "FOL";
        System.out.println("El array contiene las siguientes palabras");
        for(int i=0; i<7;i++){
            System.out.print("La asignatura" + Asignatura[i] + "Con nota" + Notas[i]);
        }
    }
    
}


