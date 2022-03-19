package com.game;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    final int MAIN_EXIT = 5;
    Scanner sc = new Scanner(System.in);

    //Database Connection
    BirdRepository birdRepository = new BirdRepository();

    void getBirds(Set list){
        for (Object bird: list) {
            System.out.println(bird);
        }
    }

    void printFlyables(Set<Birds> list) {
        for (Birds bird : list) {
            if (bird instanceof Flyables) {
                ((Flyables) bird).fly();
            }
        }
    }

    void printSwimmables(Set<Birds> list) {
        for (Birds bird : list) {
            if (bird instanceof Swimmables) {
                ((Swimmables) bird).swim();
//                Swimmables swimmableBird = (Swimmables) bird;
//                swimmableBird.swim();
            }
        }
    }

    int showMainMenu(){
        System.out.println("""
                1 -> Create New Birds.
                2 -> Display a specific Birds in Sanctuary.\s
                3 -> Edit an entry.\s
                4 -> Delete Bird entry.
                """+ MAIN_EXIT + """
                 -> Exit Program.
                """);
        System.out.print("Choice: ");
        return sc.nextInt();
    }

    void addBirdObjects(){
        //Create Bird using User Input.
        Penguin pengu = new Penguin("PG01");
        Penguin pengu2 = new Penguin("PG01");
        Duck donald = new Duck("D01");
        Parrot mitthu = new Parrot("P01");
        Ostrich oscar = new Ostrich("O01");
        Hen henry = new Hen("H01");
        birdRepository.addBird(pengu);
        birdRepository.addBird(pengu2);
        birdRepository.addBird(donald);
        birdRepository.addBird(mitthu);
        birdRepository.addBird(oscar);
        birdRepository.addBird(henry);
    }

    public void navigator(int choice) {
        switch (choice){
            case 1 -> {
                addBirdObjects();
            }
            case 2 -> {
                System.out.print("Enter the ID of the Bird: ");
                String id = sc.next();
                Birds match = birdRepository.getBird(id);
                System.out.println("\n" + match.toString() + "\n");
            }
            case 3 -> {
//                editBird(name);
            }
            case 4 -> {
//                delBird(name);
            }
            case MAIN_EXIT -> System.out.println("Closed the program.");
            default -> System.out.println("Enter correct choice.");
        }
    }
}

