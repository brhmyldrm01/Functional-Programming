package com.company;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        ArrayList<Character> list=new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');

        for (char l:list) {
            System.out.println(l);
        }

        System.out.println("lambda");
        list.forEach((n)-> System.out.println(n));

        //Functional Interface impl.
        System.out.println("Functional interface");
        Function<Integer,Integer> increase  =(n)-> n+1;
        int result= increase.apply(5);
        System.out.println(result);//6





    }
}
