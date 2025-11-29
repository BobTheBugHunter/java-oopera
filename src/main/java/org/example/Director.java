package org.example;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Sex gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }


    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        if (numberOfShows >= 0) {
            this.numberOfShows = numberOfShows;
        } else {
            System.out.println("Количество шоу не может быть отрицательным!");
        }
    }

    public void printInfo() {
        System.out.println("Имя режиссёра: " + getName()+ "\n" + " Фамилия режиссёра: " + getSurname() +
                "\n" + " Пол режиссёра: " + getGender() + "\n");
    }
}
