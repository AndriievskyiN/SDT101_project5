package part1;

public class Person implements Comparable<Person> {
    private String name;
    private int birth_year;

    public Person(String name, int birth_year) {
        this.name = name;
        this.birth_year = birth_year;
    }

    public int compareTo(Person other) {
        return Integer.compare(this.birth_year, other.birth_year);
    }
}

