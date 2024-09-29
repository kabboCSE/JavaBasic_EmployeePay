package Decesions;

import java.util.Scanner;

public class PayEmployeeWithBonus {
    public static void main(String[] args) {
        int weeklyHourRange = 30;
        double ratePerHour = 10.0;
        double bonusAmount = 2;

        System.out.println("Type WeeklyHour: ");
        Scanner scanner = new Scanner(System.in);
        int weeklyHour = scanner.nextInt();

        double payable = weeklyHour * ratePerHour;

        if (weeklyHour >= weeklyHourRange) {
            payable = payable + bonusAmount;
            System.out.println("Congratulations! You are eligible for Bonus");
        }
        else{
            System.out.println("You are not eligable for Bonus");
        }
        System.out.println("Total Payable: " + payable);



    }
}



