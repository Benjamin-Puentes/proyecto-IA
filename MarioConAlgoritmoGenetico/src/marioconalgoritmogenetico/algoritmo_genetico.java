package marioconalgoritmogenetico;

import java.util.ArrayList;

public class algoritmo_genetico {

    private static final int POPULATION_SIZE = 100;
    private static final int CHROMOSOME_LENGTH = 50;
    private static final String VALID_GENES = "DISJ";

    public static ArrayList<individuo> initializePopulation() {
        ArrayList<individuo> population = new ArrayList<individuo>();
        for (int i = 0; i < POPULATION_SIZE; i++) {
            StringBuilder chromosome = new StringBuilder();
            for (int j = 0; j < CHROMOSOME_LENGTH; j++) {
                int randomIndex = (int) (Math.random() * VALID_GENES.length());
                chromosome.append(VALID_GENES.charAt(randomIndex));
            }
            population.add(new individuo(chromosome.toString()));
        }
        return population;
    }


    
    public void seleccionar() {
    //metodo que utiliza un algoritmo de selección por torneo para seleccionar los individuos que participarán en el cruce.
        ArrayList<individuo> population = initializePopulation();
        ArrayList<individuo> matingPool = new ArrayList<individuo>();
        for (int i = 0; i < POPULATION_SIZE; i++) {
            int randomIndex1 = (int) (Math.random() * POPULATION_SIZE);
            int randomIndex2 = (int) (Math.random() * POPULATION_SIZE);
            individuo individual1 = population.get(randomIndex1);
            individuo individual2 = population.get(randomIndex2);
            if (individual1.getFitness() > individual2.getFitness()) {
                matingPool.add(individual1);
            } else {
                matingPool.add(individual2);
            }
        }
    }
    
    
    public void cruzar() {
    //metodo que utiliza un algoritmo de cruce de un punto para generar nuevos individuos a partir de los padres seleccionados.
    }

    //metodo que utilice un algoritmo de mutación (como la mutación por intercambio) para introducir variación en la población.
    public void mutar() {
        
    }

    //metodo que controle el número de iteraciones y utilice los métodos anteriores para encontrar la mejor solución posible.
    public void ejecutar() {
    
    }

}
