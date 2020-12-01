package chapter_3_13;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(/*firstName*/"Stanley", /*lastName*/"Yang", /*monthlySalary*/5000);
        Employee employee2 = new Employee(/*firstName*/"Homer", /*lastName*/"Simpson", /*monthlySalary*/-100);

        System.out.println(employee1.getMonthlySalary());
        System.out.println(employee2.getMonthlySalary());

        employee2.setMonthlySalary(400);
        System.out.println(employee2.getMonthlySalary());
        System.out.println(employee1.annualSalary());
        System.out.println(employee1.giveRaise());

    }
}
