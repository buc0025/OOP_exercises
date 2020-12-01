package chapter_3_16;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter your birth month: ");
        int month = input.nextInt();

        while (month <= 0 || month > 12) {
            System.out.print("Enter valid month: ");
            try {
                month = input.nextInt();
            } catch (Exception e) {
                throw new IllegalArgumentException("not a valid month");
            }

        }

        System.out.print("Please enter your day of birth: ");
        int day = input.nextInt();

        while (day <= 0 || day > 31) {
            System.out.print("Enter valid day: ");
            try {
                day = input.nextInt();
            } catch (Exception e) {
                throw new IllegalArgumentException("not a valid day");
            }
        }

        System.out.print("Please enter your year of birth: ");
        int year = input.nextInt();

        while (year <= 1900 || year > 2020) {
            System.out.print("Enter valid year: ");
            try {
                year = input.nextInt();
            } catch (Exception e) {
                throw new IllegalArgumentException("not a valid year");
            }
        }

        HeartRates person1 = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("Name: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Date of birth: " + person1.getBirthMonth() + "/" + person1.getBirthDay() + "/" + person1.getBirthYear());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Maximum heart rate: " + person1.maxHR());
        System.out.println("Target heart rate range: " + person1.targetHR());

    }
}
