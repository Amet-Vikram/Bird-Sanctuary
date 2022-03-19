package com.game;

public class Hen extends Birds  implements Swimmables {

    Hen(String id){
        super(id);
        name = "Henry";
        color = Color.RED;
    }

    @Override
    public void swim(){
        System.out.println(getClass().getSimpleName() + " Swims.");
    }

}
