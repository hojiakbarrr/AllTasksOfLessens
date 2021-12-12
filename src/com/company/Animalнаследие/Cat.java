package com.company.Animalнаследие;

public class Cat extends com.company.Animalнаследие.Animal {
    @Override
    public void swam(int swim) {
        if (swim <= 0) {
            System.out.println("К сожалению кот не умеет плавать");
        }
    }

    @Override
    public void ran(int run) {
        if (run <= 200){
            System.out.println("Кот сможет пробежать " + run + " метров ");
        }else {
            System.out.println("К сожалению кот не сможет пробежать эту дистанцию " + run + " м");
        }
    }
}
