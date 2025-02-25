public class Ejercicio2 {
    public static int aleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }           
    public static int[] cargarTabla(int n) {
        int tabla[] = new int[n];
        for(int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio(1, 100);
        }
        return tabla;
    }
    public static double sumarPares(int tabla[]) {
        double suma = 0;
        for(int i = 0; i < tabla.length; i++) {
            if(tabla[i] % 2 == 0) {
                suma += tabla[i];
            }
        }
        return suma;
    }
    public static double productoImpares(int tabla[]) {
        double producto = 1;
        for(int i = 0; i < tabla.length; i++) {
            if(tabla[i] % 2 != 0) {
                producto *= tabla[i];
            }
        }
        return producto;
    }
    public static void imprimirDatos(int tabla[], double pares, double impares) {
        for(int i = 0; i < tabla.length; i++) {
            System.out.println("Dato " + i + ": " + tabla[i]);
        }
        System.out.println("Suma de los pares: " + pares);
        System.out.println("Producto de los impares: " + impares);
    }
    public static void main(String[] args) throws Exception {
        int datos [] = cargarTabla(20);
        imprimirDatos(datos, sumarPares(datos), productoImpares(datos));
    }
}


/* Cargar una tabla de 20 componentes enteros y calcular la suma de los
componentes de posición par y el producto de los componentes de posición
impar. Los valores se generarán aleatoriamente entre 1 y 100.
a) Segunda versión del ejercicio, crear los siguientes métodos:
 generarNumero: crea un número aleatorio entre 1 y 100 y lo devuelve.
 cargarTabla: carga el array de los 20 elementos, llama a
generarNumero para cargar el dato.
 sumaPares: recibe el array por parámetro. Calcula la suma de los
números de la posición par y lo devuelve.
 prodImpares: recibe el array por parámetro. Calcula el producto de los
números de la posición impar y lo devuelve.
 imprimirDatos: Parámetros: array con los números, suma de los pares,
producto de los impares. Muestra el contenido del array y después la
suma y el producto calculados anteriormente. */