package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> ListA = new ArrayList<>();
        ArrayList<String> ListB = new ArrayList<>();
        ArrayList<String> ListC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ListA :");
        for (int i = 0; i <5 ; i++) {
            ListA.add(scanner.nextLine());


        }
        System.out.println(ListA);

        System.out.println("ListB :");
        for (int i = 0; i < 5; i++) {
            ListB.add(scanner.nextLine());

        }
        System.out.println(ListB);
        System.out.println("--------------------");

        Collections.reverse(ListB);
        int x = 0;
        while (ListC.size() < ListA.size() + ListB.size()){
            ListC.add(ListA.get(x));
            ListC.add(ListB.get(x));
            x++;
        }
        System.out.println(ListC);
        System.out.println("-----------------------");


        Collections.sort(ListC, Comparator.comparingInt(String::length));
        System.out.println(ListC);
    }
}