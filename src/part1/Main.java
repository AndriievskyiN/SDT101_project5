package part1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 1990);
        Person p2 = new Person("Bob", 1980);
        Person p3 = new Person("Charlie", 2000);

        // Demonstrate comparison for different situations
        System.out.println(p1.compareTo(p2)); // Returns 1 (p1 is greater than p2)
        System.out.println(p2.compareTo(p3)); // Returns -1 (p2 is less than p3)
        System.out.println(p1.compareTo(p3)); // Returns -1 (p1 is less than p3)
        System.out.println(p1.compareTo(p1)); // Returns 0 (p1 is equal to p1)
    }
}