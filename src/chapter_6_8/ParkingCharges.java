package chapter_6_8;

import java.security.SecureRandom;
import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int customer = 1;
        double total = 0;
        int hours = 1;

        while (hours > 0) {
            System.out.println("Enter hours for customer " + customer);
            customer++;
            hours = input.nextInt();
            total += calculateCharges(hours);
            System.out.println("Totals for today: " + total);
        }

    }

    public static double calculateCharges(int hours) {
        if (hours <= 0) {
            return 0;
        }

        if (hours <= 3) {
            return 2;
        }

        if (hours >= 24) {
            return 10;
        } else {
            return (hours - 3) * 0.5 + 2;
        }
    }
}
