package com.company;

public class Main {

    public static void main(String[] args) {
         class Islem {

            int topla(int a, int b) {
                return a + b;
            }

            int carp(int a, int b) {
                return a * b;
            }

        Islem islem =new Islem();

            //Asagidaki islemler yerine yazilan degerlerin her zaman aynı olacağını bildiğimizden
            //yaptıgımız yerine koyma işlemleri hicbir zaman programın calısmasını etkilemez.
             // int x = islem.topla(2, carp(3, 4));
             // int x= islem.topla(2,12);
                int x=14;

         }
    }
}

