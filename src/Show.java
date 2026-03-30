import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printShowDirector() {
        System.out.println(director);
    }

    public void printListOfActors() {
        System.out.println("Актерский состав \"" + title + "\":");
        System.out.println(listOfActors);
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже участвует в спектакле");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor actor, String oldSurname) {
        for (Actor oldActor : listOfActors) {
            if (oldSurname == oldActor.surname) {
                listOfActors.remove(oldActor);
                listOfActors.add(actor);
                return;
            }
        }
        System.out.println("Актер с фамилией " + oldSurname + " не найден");
    }
}
