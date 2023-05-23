package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ion", "Vasile");

        name.stream()
                .filter(str -> str.length() < 5)
                .forEach(System.out::println);
        name.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println(name.stream()
                .map(String::length)
                .filter(length -> length < 4)
                .reduce(0, Integer::sum));
    }
}}