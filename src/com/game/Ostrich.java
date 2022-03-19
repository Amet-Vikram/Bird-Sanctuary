package com.game;

public class Ostrich extends Birds  implements Swimmables{

    Ostrich(String id){
        super(id);
        name = "Oscar";
        color = Color.BROWN;
    }

    @Override
    public void swim(){
        System.out.println(getClass().getSimpleName() + " doesn't Swim.");
    }
}
