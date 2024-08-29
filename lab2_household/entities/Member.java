package lab2_household.entities;

public class Member {
    public static int autoId;
    private int id;
    private String fullName;
    private String dateOfBirth;
    private String job;

    public Member(String fullName, String dateOfBirth, String job) {
        this.id = ++autoId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
    }

    public Member() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
