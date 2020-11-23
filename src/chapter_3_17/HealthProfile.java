package chapter_3_17;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    private int height;
    private int weight;

    public HealthProfile(String firstName, String lastName, int month, int day, int year, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        return (getWeight() * 703) / (getHeight() * getHeight());
    }

    public int maxHR() {
        return 220 - getAge();
    }

    public String targetHR() {
        double min = .5 * maxHR();
        double max = .85 * maxHR();

        return min + " - " + max;
    }

    public int getAge() {
        if (getMonth() <= 11 && getDay() <= 23) {
            return 2020 - getYear();
        } else {
            return 2020 - getYear() - 1;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
