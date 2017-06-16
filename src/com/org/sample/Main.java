package com.org.sample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<String>();
        namesList.add("David");
        namesList.add("Mike");
        namesList.add("John");

        lambdaToPrintItemsInCollection1(namesList);
        lambdaToPrintItemsInCollection2(namesList);

        System.out.println("develop commit 1");
        System.out.println("master commit 2");
        System.out.println("develop commit 3");
    }

    private static void lambdaToPrintItemsInCollection2(List<String> list) {
        System.out.println("Usage 1: Print using lambda");
        list.forEach(name -> System.out.println(name));
    }

    private static void lambdaToPrintItemsInCollection1(List<String> list) {
        System.out.println("\nUsage 2: Print using lambda");
        list.forEach(System.out::println);
    }
}
