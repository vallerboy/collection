import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {


        return Objects.hash(name, lastname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return lastname.compareTo(o.lastname);
    }
}

