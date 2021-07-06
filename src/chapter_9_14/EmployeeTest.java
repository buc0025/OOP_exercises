package chapter_9_14;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee(/*firstName=*/"Stanley", /*lastName=*/"Yang", /*ssn=*/"222-22-3211");
        CommissionEmployee commissionEmployee = new CommissionEmployee(/*firstName=*/"Stan", /*lastName=*/"Lee",
                /*ssn=*/"654", /*grossSales=*/500.25, /*commissionRate=*/.87);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(/*firstName=*/"Joe",
                /*lastName=*/"Schmoe", /*ssn=*/"123",/*grossSales=*/1000,
                /*commissionRate=*/.9, /*baseSalary=*/5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(/*firstName=*/"John",/*lastName=*/"Smith",
                /*ssn=*/"654", /*hoursWorked=*/0.5, /*perPerHour=*/35);

        System.out.println(employee);
        System.out.println();
        System.out.println(commissionEmployee);
        System.out.println();
        System.out.println(basePlusCommissionEmployee);
        System.out.println();
        System.out.println(hourlyEmployee);
    }
}
