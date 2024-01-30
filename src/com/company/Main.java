package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalHouse<Tiger> tigerHouse = new AnimalHouse<>();
        AnimalHouse<Bird> birdHouse = new AnimalHouse<>();
        Tiger tiger = new Tiger("tigurcho");
        Bird bird = new Bird(6.9);

        tigerHouse.animal = tiger;
        birdHouse.animal = bird;

        System.out.println(tigerHouse.animal.name);
        System.out.println(birdHouse.animal.highOfFlight);
    }
}
