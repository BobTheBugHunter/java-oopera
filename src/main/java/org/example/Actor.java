package org.example;

public class Actor extends Person{
    private double height;

    public Actor(String name, String surname, Sex gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("Слишком низкое значение роста!");
        }
    }
}
