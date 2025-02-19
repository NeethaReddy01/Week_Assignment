package day4Tasks;

import java.io.*;
import java.util.*;

public class TestCity {
    public static void main(String[] args) {
        CityStateMap cityStateMap = new CityStateMap();

        File file = new File("city_state.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String city = parts[0].trim();
                    String state = parts[1].trim();
                    cityStateMap.addCityStatePair(city, state);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("All Cities: " + cityStateMap.getAllCities());
        System.out.println("All States: " + cityStateMap.getAllStates());

        String stateToCheck = "California";
        System.out.println("Cities in " + stateToCheck + ": " + cityStateMap.getCitiesForState(stateToCheck));

        String newCity = "NewCity";
        String newState = "NewState";
        cityStateMap.addCityStatePair(newCity, newState);
        System.out.println("After adding " + newCity + " in " + newState);
        System.out.println("All Cities: " + cityStateMap.getAllCities());

        String stateToDelete = "Texas";
        cityStateMap.deleteCitiesForState(stateToDelete);
        System.out.println("After deleting all cities in " + stateToDelete);
        System.out.println("All Cities: " + cityStateMap.getAllCities());
    }
}

