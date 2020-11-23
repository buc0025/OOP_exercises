package chapter_3_17;

import java.util.Scanner;

public class HealthProfileTest {

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
        System.out.print("Please enter your height in inches: ");
        int height = input.nextInt();
        System.out.print("Please enter your weight in pounds: ");
        int weight = input.nextInt();

        HealthProfile stanley = new HealthProfile(firstName, lastName, month, day, year, height, weight);

        System.out.println("Name: " + stanley.getFirstName() + " " + stanley.getLastName());
        System.out.println("Date of birth: " + stanley.getMonth() + "/" + stanley.getDay() + "/" + stanley.getYear());
        System.out.println("Age: " + stanley.getAge());
        System.out.println("Maximum heart rate: " + stanley.maxHR());
        System.out.println("Target heart rate range: " +stanley.targetHR());
        System.out.println("BMI: " + stanley.getBMI());
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    }
}
