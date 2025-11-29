package org.example;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        /* ********* АКТЁРЫ С АВТОРАМИ И РЕЖИССЁРЫ ************ */
        Actor actorBob = new Actor("Боб", "Большой", Sex.MALE, 190);
        Actor actorBobina = new Actor("Бобина", "Большая", Sex.FEMALE, 175);
        Actor actorBagi = new Actor("Багира", "Большая", Sex.FEMALE, 150);
        Director directorMisha = new Director("Михаил", "Вишнёвский", Sex.MALE, 30);
        Director directorElena = new Director("Елена", "Добронравова", Sex.FEMALE, 100);
        Person musicAuthor = new Person("Вован", "Селиванов", Sex.MALE);
        Person choreographer = new Person("Николай", "Наумов", Sex.MALE);

        /* ********* СПЕКТАКЛИ ************ */
        Show show = new Show("Вечер в саду", 285, directorMisha, new ArrayList<>());
        Opera opera = new Opera("Феличита", 210, directorElena,
                new ArrayList<>(), musicAuthor, "Text", 10);
        Ballet ballet = new Ballet("Танец Коляна", 10, directorMisha,
                new ArrayList<>(), musicAuthor, "TextToBallet", choreographer);


        /* ********* РАСПРЕДЕЛЕНИЕ АКТЁРОВ ************ */
        show.addNewActorToShow(actorBobina);
        show.addNewActorToShow(actorBob);
        opera.addNewActorToShow(actorBagi);
        ballet.addNewActorToShow(actorBobina);
        ballet.addNewActorToShow(actorBob);
        ballet.addNewActorToShow(actorBagi);

        /* ********* ВЫВОД СПИСКА АКТЁРОВ ************ */

        System.out.println("Список актёров для спектакля: " + show.getTitle());
        show.printListOfActors();
        System.out.println("\nСписок актёров для спектакля: " + opera.getTitle());
        opera.printListOfActors();
        System.out.println("\nСписок актёров для спектакля: " + ballet.getTitle());
        ballet.printListOfActors();
        System.out.println();

        /* ********* ЗАМЕНА АКТЁРОВ ************ */
        show.replaceActorInShow(actorBagi, actorBobina.getSurname());
        show.printListOfActors();

        System.out.println("\nПробуем заменить несуществующего актёра!\n");
        ballet.replaceActorInShow(actorBagi, "Огурец");

        System.out.println("\nТекст либретто для спектакля: " + opera.getTitle());
        System.out.println(opera.getLibrettoText());

    }
}
