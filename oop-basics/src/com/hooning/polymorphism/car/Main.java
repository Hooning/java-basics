package com.hooning.polymorphism.car;

class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String startEngine() {
        return "Start Engine...";
    }

    public String accelerate() {
        return "Car accelerating!!";
    }

    public String breakCar() {
        return "Breaking the car!";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Focus extends Car {

    public Focus(String name, int Cylinders) {
        super(name, Cylinders);
    }

    @Override
    public String startEngine() {
        return "Broom Ford Focus Engine started!";
    }

    @Override
    public String accelerate() {
        return "Focus!!!!!!!!!!!!";
    }

    @Override
    public String breakCar() {
        return "Ford focus Stop it.";
    }

}

class Polo extends Car {
    public Polo(String name, int Cylinders) {
        super(name, Cylinders);
    }

    @Override
    public String startEngine() {
        return "Polo engine Started --> Yeh";
    }

    @Override
    public String breakCar() {
        return "Break the polo!";
    }
}

class X7 extends Car {
    public X7(String name, int Cylinders) {
        super(name, Cylinders);
    }

    @Override
    public String accelerate() {
        return "BMW WOOOONG";
    }

    @Override
    public String breakCar() {
        return "X7 Break the beat";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 7);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.breakCar());

        Focus focus = new Focus("Ford Focus", 4);
        System.out.println(focus.startEngine());
        System.out.println(focus.accelerate());
        System.out.println(focus.breakCar());

        Polo polo = new Polo("VW Polo", 2);
        System.out.println(polo.startEngine());
        System.out.println(polo.accelerate());
        System.out.println(polo.breakCar());

        X7 x7 = new X7("BMW X7", 8);
        System.out.println(x7.startEngine());
        System.out.println(x7.accelerate());
        System.out.println(x7.breakCar());
    }

}
