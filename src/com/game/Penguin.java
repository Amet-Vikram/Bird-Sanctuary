package com.game;

public class Penguin extends Birds  implements Swimmables{

    Penguin(String id){
        super(id);
        name = "Pengu";
        color = Color.BLACK;
    }


    @Override
    public void swim(){
        System.out.println(getClass().getSimpleName() + " Swims");
    }
}
