package com.game;

public class Duck extends Birds implements Flyables, Swimmables {

    Duck(String id){
        super(id);
        name = "Daffy";
        color = Color.YELLOW;
    }

    @Override
    public void fly(){
        System.out.println(getClass().getSimpleName() + " is Flying");
    }

    @Override
    public void swim(){
        System.out.println(getClass().getSimpleName() + " Swims");
    }
}
