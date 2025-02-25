import java.util.Random;

public class Ejercicio4 {
    public static String[] cargarArrayNombres(){
        String nombres[] = new String[10];
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Maria";
        nombres[3] = "Jose";
        nombres[4] = "Ana";
        nombres[5] = "Lucia";
        nombres[6] = "Carlos";
        nombres[7] = "Luis";
        nombres[8] = "Sofia";
        nombres[9] = "Laura";
        return nombres;
    }

    public static int[] cargarArrayNotas(){
        Random rd = new Random();
        int notas[] = new int[10];
        for(int i = 0; i < notas.length; i++){
            notas[i] = rd.nextInt(11);
        }
        return notas;
    }
    public static int[] calcularDatos(int[] notas){
        int min = 11;
        int suma = 0;
        int indice_min = 0;
        int maximo = 0;
        int indice_max = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < min){
                min = notas[i];
                indice_min = i;
            }
            if(notas[i] > maximo){
                maximo = notas[i];
                indice_max = i;
            }
            suma += notas[i];
        }
        int [] datos = {min, indice_min, suma, suma/notas.length, maximo, indice_max};
        return datos;
    }
    public static void mostrarEstadisticas(String[] nombres, int[] datos){
        System.out.println("Nombre de la persona con la nota más baja: " + nombres[datos[1]]);
        System.out.println("Promedio de notas: " + datos[3]);
        System.out.println("Nombre de la persona con la nota más alta: " + nombres[datos[5]]);
    }
    public static void main(String[] args) {
        String nombre [] = new String[10];
        int notas [] = new int[10];
        int datos [] = new int[6]; 
        nombre = cargarArrayNombres();
        notas = cargarArrayNotas();
        datos = calcularDatos(notas);
        for(int i = 0; i < nombre.length; i++){
            System.out.println("Nombre: " + nombre[i] + " Nota: " + notas[i]);
        }
        mostrarEstadisticas(nombre, datos);

    } 
}

/* Cargar dos tablas, una con los nombres y otra con las calificaciones de los N
alumnos de una clase de Programación.
 Rellenar arrays con el nombre del alumno y su nota validando entre 0 y 10.
 Mostrar la lista de alumnos junto con su nota correspondiente:
Nombre1 Apellido11 Apellido12 - Nota
Nombre2 Apellido21 Apellido22 - Nota
 Calcular la media de la clase.
 Escribir los alumnos cuya nota es mayor que la media.
 Calcular la nota máxima y quienes la han conseguido.
 Calcular la nota mínima y quienes la han conseguido.
a) Primera versión del ejercicio, crear diferentes métodos para realizar los
cálculos anteriores. Se da total libertad para definir los métodos que se
consideren oportunos.
b) Segunda versión del ejercicio, crear los siguientes métodos:
 Método cargarArrayNombres: método que rellena un array con los
nombres de 10 alumnos y lo devuelve.
 Método cargarArrayNotas: método que rellena un array con las notas de
los 10 alumnos y lo devuelve. Las notas deben estar validadas entre 0 10.
 Método mostrarTodosDatos: recibe por parámetros los dos arrays
creados en los puntos anteriores y los muestra por pantalla.
 Método calculoDatos: recibe como por parámetros el array de notas
creado anteriormente. Con estos datos se debe calcular:
o la nota media de la clase
o la nota máxima de los alumnos
o a quién pertenece dicha nota
o la nota mínima
o a quién pertenece dicha nota.
En caso de haber notas repetidas, prevalece el último alumno
consultado. El método debe devolver un array con los cuatro datos
calculados.
 Método mostrarEstadisticas: recibe como parámetro el array de nombres
de alumnos y el array creado en el punto anterior. Con esto, muestra por
pantalla los datos calculados en el punto anterior. */