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
        System.out.print("Please enter your day of birth: ");
        int day = input.nextInt();
        System.out.print("Please enter your birth year: ");
        int year = input.nextInt();

        HeartRates person1 = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("Name: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Date of birth: " + person1.getMonth() + "/" + person1.getDay() + "/" + person1.getYear());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Maximum heart rate: " + person1.maxHR());
        System.out.println("Target heart rate range: " + person1.targetHR());

    }
}
