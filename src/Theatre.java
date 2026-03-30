public class Theatre {
    public static void main(String[] args) {
        Director director1 = new Director("Андрей", "Андреев", Gender.MALE, 5);
        Director director2 = new Director("Балабан", "Балабанов", Gender.MALE, 67);
        Actor actor1 = new Actor("Аверьян", "Ильянов", Gender.MALE, 143);
        Actor actor2 = new Actor("Брат", "Грузов", Gender.MALE, 178);
        Actor actor3 = new Actor("Снежана", "Леопардова", Gender.FEMALE, 190);
        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Анастасия", "Зосуд", Gender.FEMALE);

        Show show = new Show("Лебединое озеро", 34, director1);
        Opera opera = new Opera("Лебединое озерцо", 197, director2, musicAuthor, "либретто текст", 540);
        Ballet ballet = new Ballet("Пруд галок", 73, director2, musicAuthor, "либретто текст2", choreographer);

        show.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor2);

        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        show.changeActor(actor1, "Леопардова");
        show.printListOfActors();

        ballet.changeActor(actor3, "Зосуд");

        opera.printLibretto();
        ballet.printLibretto();
    }
}
