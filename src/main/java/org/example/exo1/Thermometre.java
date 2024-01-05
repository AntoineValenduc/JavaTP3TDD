package org.example.exo1;


public class Thermometre {

    /**
     * Méthode permettant de trouver, parmi les entiers d'un tableau, l'entier le plus proche de 0
     * @param tableauInts Tableau d'entiers
     * @return - entier le plus proche de 0
     */
    public int temperature(int[] tableauInts){

        verificationLongeurTableau(tableauInts);

        if (tableauInts.length == 0 || tableauInts == null){
            return 0;
        } else {
            return parcoursTableauInts(tableauInts);
        }
    }

    /**
     * Parcours du tableau pour déterminer la température la plus proche de 0,
     * @param tableauInts Tableau d'entiers
     * @return - entier le plus proche de 0
     */
    private int parcoursTableauInts(int[] tableauInts) {
        int temperature = Integer.MAX_VALUE;
        for (int valeur : tableauInts)
            if (Math.abs(valeur) < Math.abs(temperature)) {
                temperature = valeur;
            } else if (Math.abs(valeur) == Math.abs(temperature) && (temperature < valeur)){
                temperature = valeur;
            }
        return temperature;
    }

    /**
     * Test la longueur du tableau fournit en paramètre de la méthode temperature,
     * relève une exception en cas de dépassement de la longueur requise (10000)
     * @param tableauInts Tableau d'entiers
     */
    private void verificationLongeurTableau(int[] tableauInts) {

        if (tableauInts.length > 10000){
            throw new IllegalArgumentException("La longueur du tableau ne doit pas dépasser 10000");
        }
    }
}
