package day4Tasks;

import java.util.*;

public class CityStateMap extends AbstractMap<String, String> {
    private Map<String, String> cityStateMap;

    public CityStateMap() {
        cityStateMap = new HashMap<>();
    }

    public void addCityStatePair(String city, String state) {
        cityStateMap.put(city, state);
    }

    public Set<String> getAllCities() {
        return cityStateMap.keySet();
    }

    public Set<String> getAllStates() {
        return new HashSet<>(cityStateMap.values());
    }

    public Set<String> getCitiesForState(String state) {
        Set<String> cities = new HashSet<>();
        for (Map.Entry<String, String> entry : cityStateMap.entrySet()) {
            if (entry.getValue().equals(state)) {
                cities.add(entry.getKey());
            }
        }
        return cities;
    }

    public void deleteCitiesForState(String state) {
        cityStateMap.entrySet().removeIf(entry -> entry.getValue().equals(state));
    }

    @Override
    public String get(Object city) {
        return cityStateMap.get(city);
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return cityStateMap.entrySet();
    }
}

