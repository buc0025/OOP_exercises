package chapter_3_16;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
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
}
