package com.hooning.inheritance;

public class InheritanceDemoApp {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 8);

        Dog dog = new Dog("Happy", 2, 3, 2, 4, 1, 20, "long silky");
        dog.eat();
//        dog.walk();
        dog.run();

        Fish fish = new Fish("Nimo", 1,1, 2, 2, 6);
        fish.swim(2);

    }

}
