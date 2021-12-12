package com.company.Animalнаследие;

public class Dog extends com.company.Animalнаследие.Animal {
    @Override
    public void swam(int swim) {
        if (swim <= 10){
            System.out.println("Собака проплыла " + swim + " метров дистанции");
        }else {
            System.out.println("Собака не сможет проплыть столько дистанции - " + swim + " м");
        }

    }

    @Override
    public void ran(int run) {
        if (run <= 500){
            System.out.println("Собака пробежала " + run + " метров дистанции");
        }else {
            System.out.println("Собака не сможет пробежать эту дистанцию " + run + " м");
        }
    }
}
