package com.game;

public class Parrot extends Birds  implements Flyables {

    Parrot(String id){
        super(id);
        name = "Mitthu";
        color = Color.GREEN;
    }

    @Override
    public void fly(){
        System.out.println(getClass().getSimpleName() + " is Flying");
    }


}
