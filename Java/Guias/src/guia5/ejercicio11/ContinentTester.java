package guia5.ejercicio11;

import guia4.ejercicio14.Continent;

import java.util.Arrays;
import java.util.Comparator;

public class ContinentTester {
    public static void main(String[] args) {
        Continent[] continents = new Continent[]{
                Continent.OCEANIA,
                Continent.AMERICA,
                Continent.EUROPE};
        Arrays.sort(continents, new Comparator<Continent>() {
            @Override
            public int compare(Continent o1, Continent o2) {
                return (int) (o1.getPopulationRatio() - o2.getPopulationRatio());
            }
        });
        for(Continent continent : continents) {
            System.out.println(continent);
        }
    }

    /*
        América
        Europa
        Oceanía
    */
}

