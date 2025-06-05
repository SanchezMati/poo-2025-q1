package Parcial2.consultas.ejercicio2;

import java.util.*;

public class TravelGuide {
    private final Map<String, Map<String, Set<Landmark>>> map = new HashMap<>();

    public void addLandmark(String country, String city, Landmark landmark) {
        map.putIfAbsent(country, new TreeMap<>());
        map.get(country).putIfAbsent(city, new TreeSet<>());
    }

    public int landmarksCount(String country, String city) {
        return getLandmarksFromCity(country, city).size();
    }

    public Collection<Landmark> getLandmarksFromCity(String country, String city) {
        return map.getOrDefault(country, new TreeMap<>()).getOrDefault(city, new TreeSet<>());
    }

    public Collection<Landmark> getLandmarksFromCountry(String country) {
        Collection<Landmark> toReturn = new ArrayList<>();
        for (String city : map.getOrDefault(country, new TreeMap<>()).keySet()) {
            toReturn.addAll(getLandmarksFromCity(country, city));
        }
        return toReturn;
    }

}
