package com.company;

public class Main {

    public static void main(String[] args) {

        Box<Double, Integer> box1 = new Box<>(3.0, 2);
        Box<Float, Float> box2 = new Box<>(4.0f, 1.0f);

        addition(box1, box2);
        multiplication(box1, box2);
    }

    public static void addition(Box<? extends Double, ? extends Integer> box1, Box<? extends Float, Float> box2) {
        Number number = box1.getNumber1() + box1.getNumber2() + box2.getNumber1() + box2.getNumber2();

        System.out.println("First Box " + number);


    }

    public static void multiplication(Box<? extends Double, ? extends Integer> box1,
                                      Box<? extends Float, Float> box2) {

        Number number = box1.getNumber1() * box1.getNumber2() * box2.getNumber1() * box2.getNumber2();

        System.out.println("Second Box " + number);

    }

}
