//package com.hooning.polymorphism.movie;
//
//import java.util.Random;
//
//class Movie {
//
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot() {
//        return "No plot here";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie {
//
//    public Jaws() {
//        super("Jaws");
//    }
//
//    public String plot() {
//        return "A shark eats lots of people";
//    }
//
//}
//
//class IndependenceDay extends Movie {
//
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over planet earth";
//    }
//
//}
//
//class MazeRunner extends Movie {
//
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Kids try and escape a maze.";
//    }
//}
//
//class StarWars extends  Movie {
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "May the force be with you.";
//    }
//}
//
//class Forgetable extends Movie {
//
//    public Forgetable() {
//        super("Forgetable");
//    }
//
//    // no plot method
//
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        for (int i = 1; i < 11; i++) {
//            Movie movie = getRandomMovie();
//            assert movie != null;
//            System.out.println("Movie #" + i + " => "+
//                    movie.getName() + "\n" +
//                    "Plot: " + movie.plot() + "\n");
//        }
//    }
//
//    public static Movie getRandomMovie() {
//        int randomNumber = new Random().nextInt(5) + 1;
//        System.out.println("Random number generated was: " + randomNumber);
//        return switch (randomNumber) {
//            case 1 -> new Jaws();
//            case 2 -> new IndependenceDay();
//            case 3 -> new MazeRunner();
//            case 4 -> new StarWars();
//            case 5 -> new Forgetable();
//            default -> null;
//        };
//
//    }
//
//}
//
