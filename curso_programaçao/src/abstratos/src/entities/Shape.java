package entities;


import entities.enums.Color;

public abstract class Shape {
    private Color color;

    //=============================================================
    //construct

    public Shape(){

    }

    public Shape(Color color) {
        this.color = color;
    }

    //=============================================================
    //getters e setters

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //=============================================================
    //metodos

    public abstract double area();
}
