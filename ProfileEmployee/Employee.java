package extend_lesson_ass3;

public class Employee extends  Person{
    private double experience;

    public Employee(int id, String name, int age, double experience) {
        super(id, name, age);
        this.experience = experience;
    }

    public Employee() {
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee : " +"\n"+
                "Id: " + super.getId() +
                " Name: " + super.getName()+
                " Age: " + super.getAge() +
                " Experience: " + getExperience();

    }
}
