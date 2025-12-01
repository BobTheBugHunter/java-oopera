package TheatreLogic;

import java.util.ArrayList;

public class MusicalShow extends Show{
    private Person musicAuthor;
    private String libreTtoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       Person musicAuthor, String libreTtoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.libreTtoText = libreTtoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return libreTtoText;
    }

    public void setLibrettoText(String libreTtoText) {
        if (!libreTtoText.isBlank()) {
            this.libreTtoText = libreTtoText;
        } else {
            System.out.println("Текст либретто не может быть пустым!");
        }
    }
}
