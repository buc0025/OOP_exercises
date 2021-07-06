package chapter_9_14;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate,
                               double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }
        return baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "Base salaried", super.toString(), "base salary", getBaseSalary());
    }
}
