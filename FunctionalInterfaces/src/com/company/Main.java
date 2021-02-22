package com.company;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        // Functional interface is Interface which have only one unimplemented(abstract) method.
        // It can contain default and static methods which do have an implementation,
        // in addition to the single unimplemented method.



        //Anonymous class implementtation
        //This was used to before lambda functions.
        MyFunctionalInterface myFI = new MyFunctionalInterface() {
            @Override
            public int calculate(int x) {
                return x*x;
            }
        };

        System.out.println(myFI.calculate(5));


        // with lambda expressions
        MyFunctionalInterface lam = x -> x * x;
        System.out.println(lam.calculate(5));


        //Built-in Functional Interfaces

        // 1.Function

        System.out.println("Function Func. Interface");
        Function<Integer,Integer> multip =(x)->x * x;
        Function <Integer,Integer> sum =(x)->x + x;

        System.out.println("1..."+multip.apply(5));
        System.out.println("compose..."+multip.compose(sum).apply(5));/// output::100
        System.out.println("andThen..."+multip.andThen(sum).apply(5));// output::50

        // 2.Predicate
        System.out.println("\nPredicate Func. Interface ");
        Predicate<String> pred= (name) -> name.startsWith("I");
        Predicate<String>  pred1=(name) ->name.endsWith("f");


        System.out.println("test..."+pred.test("Ibrahim")); //true

        System.out.println("and..."+pred.and(pred1).test("Ibrahim")); // logical AND of this predicate and another.

        System.out.println("negate..."+pred.and(pred1).negate().test("Ibrahim")); //negation of this predicate

        System.out.println("or..."+pred.or(pred1).test("Ibrahim")); //logical or

        //3.Unary Operator

        System.out.println("\n Unary Operator");
        UnaryOperator<Integer> uo=(num)-> num+2;
        System.out.println(" apply.."+uo.apply(3));
        System.out.println("andThen.."+uo.andThen(uo).apply(5));

        //4. SUPPLİER
                System.out.println("Supplier");
                Supplier <Double> getRandom=()-> Math.random()*1000000D;
                System.out.println("Supplier get....."+getRandom.get());



        //5. Consumer
        System.out.println("Consumer");
        Consumer<String> getName=( name)-> System.out.println("Name::"+name);
        getName.accept("Ibrahim");
        getName.andThen(getName).accept("Ali");


        }
    }

