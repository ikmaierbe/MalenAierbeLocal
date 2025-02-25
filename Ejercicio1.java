import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);
    public static int leerEdad() {

        int edad = 0;
        do {
            System.out.println("Ingrese su edad (entre 18 y 35): ");
            edad = scanner.nextInt();
        } while (!(edad >= 18 && edad <= 35));
        return edad;
    }
    public static double calcularMedia(int edades[]) {
        int suma = 0;
        for(int i = 0; i < edades.length; i++) {
            suma += edades[i];
        }
        return suma / edades.length;
    }
    public static void mostrarEdades(int edades[]) {
        for(int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i + 1) + ": " + edades[i]);
        }
        System.err.println("La media de las edades es: " + calcularMedia(edades));
    }

    public static void main(String[] args) throws Exception {
        int edades [] = new int[5];
        for(int i = 0; i < edades.length; i++) {
            edades[i] = leerEdad();
        }
        mostrarEdades(edades);
        scanner.close();
    }
    }
   


/*import java.util.Scanner;

public class Ariketa1{

    public static int leerEdad() {
        int edad = 0;
        do {
            System.out.println("Ingrese su edad (entre 18 y 35): ");
            edad = scanner.nextInt();
        } while (edad <= 18 && edad >= 35);
        return edad;
    }

    public static double calcularMedia(int edades[]){
        int suma = 0;
        for (int i=0; i < edades.length; i++){
            suma = edades[i];
        }
        return suma ?????? edades.length;
    }

    public static void mostrarEdades(int edades []){
        for (int i=0; i < edades.length; i++){
            System.out.println("Edad " + (i+1) + ": " + edades[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        int edades [] = new int[20];
        for (int i=0; i < edades.length; i++){
            edades[i] = leerEdad();
        }
        mostrarEdades(edades);
        System.out.println("La media de las edades es: " calcularMedia(edades));
        scanner.close();
    }
}

/* Programa que lee las edades de 20 alumnos (validado entre 18 y 35), las
almacena en un array y calcula y escribe su media (para probar, se pueden
generar aleatoriamente entre 18 y 35).
a) Segunda versión del ejercicio, crear los siguientes métodos:
 leerEdad: solicita una edad por teclado entre 18 y 35 y lo devuelve.
 calcularMedia: Recibe el array por parámetro. Calcula la edad media
de los 20 alumnos y lo devuelve.
 imprimirEdad: Recibe el array por parámetro. Imprime la edad de cada
alumno y al final, la media de todos ellos. */