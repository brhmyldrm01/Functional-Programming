package com.company;

public class Main {

    static int faktoriyel( int a ) {
        if (a != 0)
            return a * faktoriyel(a-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        int input = 6, output;
        output = faktoriyel(input);
        System.out.println(input+" faktoriyel esittir "+output);//6 faktoriyel esittir 720

    }
}
