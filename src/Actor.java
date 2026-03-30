import java.util.Objects;

public class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Actor other = (Actor) obj;
        if (this.name == other.name && this.surname == other.surname && this.height == other.height) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
