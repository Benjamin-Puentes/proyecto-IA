package marioconalgoritmogenetico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class mundo {
/*lee un archivo de texto llamado world.txt, donde las 2 primeras líneas son el largo y el ancho y luego un entero por cada coordenada de la matriz,
llena de enteros entre 0 y 3, donde:
0 representa casilla libre: Mario puede avanzar a esa casilla.
1 representa casilla impenetrable: Mario no puede avanzar a esa casilla.
2 representa enemigo: Mario muere si avanza a esa casilla (excepto por arriba).
3 representa la posición de Mario para comenzar (única, debe estar en coordenada 0 de x). */
    public int largo;
    public int ancho;
    public int[][] matriz;
    
    public void leerMundo() {
        try {
            File archivo = new File("world.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int i = 0;
            while((linea = br.readLine()) != null) {
                if(i == 0) {
                    largo = Integer.parseInt(linea);
                } else if(i == 1) {
                    ancho = Integer.parseInt(linea);
                } else {
                    String[] numeros = linea.split(" ");
                    for(int j = 0; j < numeros.length; j++) {
                        matriz[i-2][j] = Integer.parseInt(numeros[j]);
                    }
                }
                i++;
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
    
    public void imprimirMundo() {
        for(int i = 0; i < largo; i++) {
            for(int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //obtener la posición inicial de Mario en el mundo.
    public int[] obtenerPosicionInicial() {
        int[] posicion = new int[2];
        for(int i = 0; i < largo; i++) {
            for(int j = 0; j < ancho; j++) {
                if(matriz[i][j] == 3) {
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    //obtener el valor de la matriz en la posición (x, y).
    public int getValueAt(int[] posicion) {
        return matriz[posicion[0]][posicion[1]];
    }

}
