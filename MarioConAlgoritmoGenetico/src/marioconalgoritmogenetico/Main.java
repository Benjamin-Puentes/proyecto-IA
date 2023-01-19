package marioconalgoritmogenetico;

public class Main {
    
    public static void main(String[] args) {
        //crea una instancia de la clase "mundo" y llama al método "leerMundo" para leer el archivo de texto.
        mundo m = new mundo();
        m.leerMundo();
        m.imprimirMundo();
        // crea una instancia de la clase "algoritmo_genetico" y llama al método "ejecutar" para resolver el problema.
        algoritmo_genetico ag = new algoritmo_genetico();
        ag.ejecutar();
    }
}
