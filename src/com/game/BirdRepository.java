package com.game;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
    private static BirdRepository instance;
    private Set<Birds> birdList = new HashSet<>();

    private BirdRepository(){} //Private constructor

    static synchronized BirdRepository getInstance(){ //method call to get instance. Singleton design.
        if (instance == null){
            instance = new BirdRepository();
        }
        return instance;
    }

    Set<Birds> getBirdList(){
        return this.birdList;
    }

    Birds getBird(String id){
        for (Birds match : birdList) {
            if (match.id.equals(id)) {
                System.out.println("=====Match Found!===== \n");
                return match;
            }
        }
        System.out.println("=====ID not found===== \n");
        return null;
    }

    void add(Birds bird){
        birdList.add(bird);
    }

    void delete(Birds bird){
        birdList.remove(bird);
    }
}
