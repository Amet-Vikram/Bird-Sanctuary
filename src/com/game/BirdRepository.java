package com.game;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

public class BirdRepository {

//    private List<Object> birdList = new ArrayList<>();
    private Set<Birds> birdList = new HashSet();

    Set getBirdList(){
        return this.birdList;
    }

    Birds getBird(String id){
        for (Birds match : birdList) {
            if (match.id.equals(id)) {
                System.out.println("Match Found!");
                return match;
            }
        }
        System.out.println("ID not found.");
        return null;
    }

    void addBird(Birds bird){
        birdList.add(bird);
    }

    void delBird(Birds bird){
        birdList.remove(bird);
    }
}
