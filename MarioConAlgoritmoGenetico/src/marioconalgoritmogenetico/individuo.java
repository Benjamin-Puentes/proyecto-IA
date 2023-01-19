package marioconalgoritmogenetico;

public class individuo {
   //propiedad para almacenar la secuencia de movimientos (D, I, S, J).
    private String secuencia = "";
    private int fitness = 0;
    private String chromosome;

    //constructor que recibe la secuencia de movimientos (D, I, S, J)
    public individuo(String secuencia) {
        this.secuencia = secuencia;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public String getChromosome() {
        return chromosome;
    }

    public String getSecuencia() {
        return secuencia;
    }

    //método que calcule el fitness de un individuo.
    public int evaluarFitness(mundo m) {
        int[] pos = m.obtenerPosicionInicial();
        int fitness = 0;
        for (int i = 0; i < chromosome.length(); i++) {
            char gene = chromosome.charAt(i);
            switch (gene) {
                case 'D':
                    pos[0]++;
                    break;
                case 'I':
                    pos[0]--;
                    break;
                case 'S':
                    pos[1]++;
                    pos[0]++;
                    pos[1]++;
                    pos[1]--;
                    pos[1]--;
                    break;
                case 'J':
                    pos[1]++;
                    pos[0]++;
                    pos[0]++;
                    pos[0]++;
                    pos[1]--;
                    break;
            }
            if (m.getValueAt(pos) == 1) {
                while (m.getValueAt(pos) == 1) {
                    pos[1]--;
                }
            }
            if (m.getValueAt(pos) == 2) {
                if (pos[1] == 0) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            if (m.ancho == -1) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public int getFitness() {
        return fitness;
    }
}
