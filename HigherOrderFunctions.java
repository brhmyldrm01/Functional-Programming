package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> sayilar = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println(sayilar); //[1, 2, 3, 4, 5, 6]

        List<Integer> ciftler = sayilar.stream()
                .map(s -> Integer.valueOf(s))
                .filter(sayi -> sayi % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(ciftler);// [2, 4, 6]

    }
}
