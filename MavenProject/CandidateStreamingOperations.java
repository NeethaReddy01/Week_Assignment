package com.insight.MavenProject;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

    public static void main(String[] args) {

       
        List<Candidate> candidates = List.of(
            new Candidate("John", "Pune", "Java", 5),
            new Candidate("Jane", "Pune", "Python", 3),
            new Candidate("Alice", "Mumbai", "Java", 0),
            new Candidate("Bob", "Bangalore", "Java", 7),
            new Candidate("Charlie", "Pune", "C++", 2)
        );

       
        System.out.println("List of Pune Candidates:");
        listPuneCandidates(candidates);

  
        printLine();
        System.out.println("Candidate count per city using Function.identity():");
        listCityCandidatesCount(candidates);

       
        printLine();
        System.out.println("Candidate count by Technical Expertise");
        listTechnicalExpertiseCount(candidates);

       
        printLine();
        System.out.println("Fresher Candidate list");
        listFresherCandidates(candidates);

      
        printLine();
        System.out.println("Sorted List of Candidates by Experience");
        listCandidatesWithHighestExperience(candidates);

      
        printLine();
        System.out.println("Sorted List of Candidates by City Name");
        listCandidatesSortedByCity(candidates);
    }

 
    public static void listPuneCandidates(List<Candidate> candidates) {
        candidates.stream()
                  .filter(candidate -> "Pune".equals(candidate.getCity()))
                  .map(Candidate::getName)
                  .forEach(System.out::println);
    }

   
    public static void listCityCandidatesCount(List<Candidate> candidates) {
   
        Map<Candidate, Long> candidateCounts = candidates.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       
        Map<String, Long> cityCounts = candidateCounts.keySet().stream()
            .collect(Collectors.groupingBy(Candidate::getCity, Collectors.counting()));

     
        cityCounts.forEach((city, count) -> System.out.println(city + ": " + count));
    }

    
    public static void listTechnicalExpertiseCount(List<Candidate> candidates) {
        Map<String, Long> expertiseCounts = candidates.stream()
                                                     .collect(Collectors.groupingBy(Candidate::getTechnicalExpertise, Collectors.counting()));
        expertiseCounts.forEach((expertise, count) -> System.out.println(expertise + ": " + count));
    }

 
    public static void listFresherCandidates(List<Candidate> candidates) {
        candidates.stream()
                  .filter(candidate -> candidate.getExperience() == 0)
                  .map(Candidate::getName)
                  .forEach(System.out::println);
    }

        public static void listCandidatesWithHighestExperience(List<Candidate> candidates) {
        candidates.stream()
                  .max(Comparator.comparingInt(Candidate::getExperience))
                  .ifPresent(candidate -> System.out.println("Highest Experience: " + candidate.getName() + " (" + candidate.getExperience() + " years)"));
    }

   
    public static void listCandidatesSortedByCity(List<Candidate> candidates) {
        candidates.stream()
                  .sorted(Comparator.comparing(Candidate::getCity))
                  .forEach(candidate -> System.out.println(candidate.getName() + " - " + candidate.getCity()));
    }

 
    private static void printLine() {
        System.out.println("======================================================");
    }

    
    public static class Candidate {
        private String name;
        private String city;
        private String technicalExpertise;
        private int experience;

       
        public Candidate(String name, String city, String technicalExpertise, int experience) {
            this.name = name;
            this.city = city;
            this.technicalExpertise = technicalExpertise;
            this.experience = experience;
        }

        
        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        public String getTechnicalExpertise() {
            return technicalExpertise;
        }

        public int getExperience() {
            return experience;
        }
    }
}
