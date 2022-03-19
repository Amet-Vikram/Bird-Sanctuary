package com.game;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Welcome to Bird Sanctuary!\n");

        UserInterface ui = new UserInterface();

        int choice;
        do {
            choice = ui.showMainMenu();
            ui.navigator(choice);
        }while (choice != ui.MAIN_EXIT);
    }
}

//        Penguin pengu = new Penguin("PG01");
//        Penguin pengu2 = new Penguin("PG01");
//        Duck donald = new Duck("D01");
//        Parrot mitthu = new Parrot("P01");
//        Ostrich oscar = new Ostrich("O01");
//        Hen henry = new Hen("H01");
//
//        Birds henry1 = (Birds) henry;
//
//        henry.eat();//Parent Class method using child class name.
//        henry1.birdFunc();//Hen Type cast to Birds.
//
//        //Database
//        BirdRepository birdRepository = new BirdRepository();
//
//        //1-many relationship
//        birdRepository.addBird(pengu);
//        birdRepository.addBird(pengu2);
//        birdRepository.addBird(donald);
//        birdRepository.addBird(mitthu);
//        birdRepository.addBird(oscar);
//        birdRepository.addBird(henry);
//
//        //UI
//        UserInterface ui = new UserInterface();
//        ui.print(birdRepository.getBirdList());
//
//        System.out.println("\n Deleted Daffy. \n");
//        birdRepository.delBird(donald);
//        ui.print(birdRepository.getBirdList());
//        System.out.println("\n");
//        ui.printFlyables(birdRepository.getBirdList());
