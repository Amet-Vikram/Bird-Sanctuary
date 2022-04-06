package com.game;

import java.util.Objects;

public class Birds {
    enum Color{
        RED, GREEN, BLUE, WHITE, YELLOW, BROWN, BLACK_WHITE, BLACK
    }
    String id;
    String name;
    Color color;
    boolean canSwim;
    boolean canFly;

    @Override
    public String toString() {
        return "Birds{" +
                "ID ='" + id + '\'' +
                ", Name ='" + name + '\'' +
                ", color =" + color +
                ", Can Swim =" + canSwim +
                ", Can Fly =" + canFly +
                '}';
    }

    void eat(){
        System.out.println(getClass().getSimpleName() + " Eats.");
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
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

}
