package lab2_household.entities;

import java.util.ArrayList;

public class Family {
    public static int autoId;
    private int id;
    private int numberHouse;
    private ArrayList<Member> members;

    public Family(int numberHouse, ArrayList<Member> members) {
        this.id = ++autoId;
        this.numberHouse = numberHouse;
        this.members = members;
    }

    public Family() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", numberHouse=" + numberHouse +
                ", members=" + members +
                '}';
    }
}
