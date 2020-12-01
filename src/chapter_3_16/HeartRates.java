package chapter_3_16;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
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
        if (birthMonth <= LocalDate.now().getMonthValue() && birthDay <= LocalDate.now().getDayOfMonth()) {
            return LocalDate.now().getYear() - birthYear;
        } else {
            return LocalDate.now().getYear() - birthYear - 1;
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

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
