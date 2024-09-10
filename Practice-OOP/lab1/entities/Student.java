package lab1.entities;

public class Student {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String address;

    public Student(String name, String address) {
        this.id = ++idCounter;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', address='" + address + "'}";
    }
}
