package com.company.Animalнаследие;

public class Human {

    public void move(int distance){
        if (distance > 1000){
            System.out.println("Человек не может пройти больше чем 500 м");
        } else {
            System.out.println("Человек прошел " + distance + "м");
        }


    }
}
