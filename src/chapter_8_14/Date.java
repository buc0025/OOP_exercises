package chapter_8_14;

public class Date {
    private int month;
    private int day;
    private int year;
    private String monthName;

    public Date(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month must be 1-12");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day must be 1-31");
        }
        if (year < 1 || year > 2020) {
            throw new IllegalArgumentException("year must be 1-2020");
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(String monthName, int day, int year) {
        if (!monthName.equals("January") || !monthName.equals("February") || !monthName.equals("March") ||
                !monthName.equals("April") || !monthName.equals("May") || !monthName.equals("June") ||
                !monthName.equals("July") || !monthName.equals("August") || !monthName.equals("September") ||
                !monthName.equals("October") || !monthName.equals("November") || !monthName.equals("December")) {
            throw new IllegalArgumentException("month must be from January - December");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day must be 1-31");
        }
        if (year < 1 || year > 2020) {
            throw new IllegalArgumentException("year must be 1-2020");
        }

        this.monthName = monthName;
        this.day = day;
        this.year = year;
    }

    public Date(int day, int year) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day must be 1-31");
        }
        if (year < 1 || year > 2020) {
            throw new IllegalArgumentException("year must be 1-2020");
        }

        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month must be 1-12");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day must be 1-31");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 2020) {
            throw new IllegalArgumentException("year must be 1-2020");
        }
        this.year = year;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        if (!monthName.equals("January") || !monthName.equals("February") || !monthName.equals("March") ||
                !monthName.equals("April") || !monthName.equals("May") || !monthName.equals("June") ||
                !monthName.equals("July") || !monthName.equals("August") || !monthName.equals("September") ||
                !monthName.equals("October") || !monthName.equals("November") || !monthName.equals("December")) {
            throw new IllegalArgumentException("month must be from January - December");
        }
        this.monthName = monthName;
    }

    public String numericDate() {
        return String.format("%d/%d/%d", getMonth(), getDay(), getYear());
    }

    public String stringDate() {
        return String.format("%s/%d/%d", getMonthName(), getDay(), getYear());
    }

    public String dayYear() {
        return String.format("%d/%d", getDay(), getYear());
    }
}
