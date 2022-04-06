package com.game;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    private static UserInterface instance;
    final int MAIN_EXIT = 7;
    final int EDIT_EXIT = 4;
    Scanner sc = new Scanner(System.in);

    private UserInterface(){}

    static synchronized UserInterface getInstance(){
        if (instance == null){
            instance = new UserInterface();
        }
        return instance;
    }

    void printFlyables(Set<Birds> list) {
        for (Birds bird : list) {
            if (bird.canFly) {
                System.out.println(bird.name + " can fly.");
            }
        }
        System.out.println("\n");
    }

    void printSwimmables(Set<Birds> list) {
        for (Birds bird : list) {
            if (bird.canSwim) {
                System.out.println(bird.name + " can swim.");
            }
        }
        System.out.println("\n");
    }

    int showMainMenu(){
        System.out.println("""
                1 -> Create New Bird.
                2 -> Remove a Bird.\s
                3 -> Edit an entry.\s
                4 -> Print Bird List.
                5 -> Print Birds that Fly
                6 -> Print Birds that Swim
                """+ MAIN_EXIT + 2 + """
                 -> Exit Program.
                """);
        System.out.print("Choice: ");
        return sc.nextInt();
    }

    int showEditMenu(){
        System.out.println("""
                What do you want to edit:
                1 -> ID.
                2 -> Name
                3 -> Color.
                """+ EDIT_EXIT + """
                 -> Exit Edit menu.
                """);
        System.out.print("Choice: ");
        return sc.nextInt();
    }

    int showColorMenu(){
        System.out.println("""
                Color Choices:
                0 -> RED
                1 -> GREEN
                2 -> BLUE
                3 -> WHITE
                4 -> YELLOW
                5 -> BROWN
                6 -> BLACK_WHITE
                7 -> BLACK
                """);
        System.out.print("Choice: ");
        return sc.nextInt();
    }

    void getBirds(Set<Birds> list){
        for (Object bird: list) {
            System.out.println(bird);
        }
    }
}

