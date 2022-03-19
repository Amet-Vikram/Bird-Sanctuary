package com.game;

import java.util.Objects;

public abstract class Birds {

    enum Color{
        RED, GREEN, BLUE, WHITE, YELLOW, BROWN, BLACK_WHITE, BLACK
    }

    String id;
    String name;
    Color color;

    Birds(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    void eat(){
        System.out.println(getClass().getSimpleName() + " Eats.");
    }

    public void birdFunc(){
        System.out.println("Exclusive to Birds. \n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(id, birds.id) && Objects.equals(name, birds.name) && color == birds.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color);
    }


//    void fly(){
//        System.out.println(getClass().getSimpleName() + " is Flying");
//    }
//
//    void swim(){
//        System.out.println(getClass().getSimpleName() + " Swims");
//    }

}
