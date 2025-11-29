package org.example;

import java.util.ArrayList;


public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Длительность спектакля не может быть настолько маленькой!");
        }

    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        for (Actor actor: listOfActors) {
            System.out.println("Имя: " + actor.getName() + " Фамилия: " +
                    actor.getSurname() + " Рост: (" + actor.getHeight() + " см.)");
        }
    }

    public void addNewActorToShow(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в спектакле!");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActorInShow(Actor actor, String surname) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() +
                    " уже есть в спектакле " + title + "."
                    + " Вот актёры которые участвуют в этом спектакле: \n");
            printListOfActors();
            return;
        }

        for (Actor actorToReplace: listOfActors) {

            if (actorToReplace.getSurname().equals(surname)) {
                listOfActors.remove(actorToReplace);
                listOfActors.add(actor);
                System.out.println("Актёра " + actorToReplace.getName() + " " + actorToReplace.getSurname()
                        + " заменили на актёра " + actor.getName() + " " + actor.getSurname() + " в спектакле " + title + "!\n");
                return;
            }
        }
        System.out.println("Актёра с такой фамилией не существует");
    }

}