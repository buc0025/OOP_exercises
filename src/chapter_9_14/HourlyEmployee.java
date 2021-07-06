package chapter_9_14;

public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double payPerHour;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double payPerHour) {
        super(firstName, lastName, socialSecurityNumber);

        if (hoursWorked < 0.0) {
            throw new IllegalArgumentException("Hours worked cannot be negative");
        }

        if (payPerHour <= 0.0) {
            throw new IllegalArgumentException("Pay per hour must be greater than 0");
        }

        this.hoursWorked = hoursWorked;
        this.payPerHour = payPerHour;
    }

    public double getHoursWorked() {
        if (hoursWorked < 0.0) {
            throw new IllegalArgumentException("Hours worked cannot be negative");
        }

        return hoursWorked;
    }

    public double getPayPerHour() {
        if (payPerHour <= 0.0) {
            throw new IllegalArgumentException("Pay per hour must be greater than 0");
        }

        return payPerHour;
    }

    public double earnings() {
        return getHoursWorked() * getPayPerHour();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f%n%s: %.2f%n%s: %s", "Hourly", super.toString(), "Hours worked", getHoursWorked(),
                "Pay per hours", getPayPerHour(), "Earnings", earnings());
    }
}
