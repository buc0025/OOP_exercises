package chapter_3_14;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be in range of 1 - 12");
        }

        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be in range of 1 - 31");
        }

        if (year < 1900 || year > 2020) {
            throw new IllegalArgumentException("Year must be in range of 1900 - 2020");
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String displayDate() {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be in range of 1 - 12");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be in range of 1 - 31");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2020) {
            throw new IllegalArgumentException("Year must be in range of 1900 - 2020");
        }
        this.year = year;
    }
}
