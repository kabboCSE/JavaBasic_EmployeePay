package loop;

import java.util.Scanner;

public class PayEmployeeWithBonus2WhileLoop {
    public static void main(String[] args) {
        int weeklyHourRange = 30;
        double ratePerHour = 10.0;
        double bonusAmount = 2;
        Scanner scanner = new Scanner(System.in);
        String controller;
        controller = scanner.next();

        while(controller.equalsIgnoreCase("yes")){
            System.out.println("Type WeeklyHour new: ");

            double weeklyHour = scanner.nextDouble();

            double payable = weeklyHour * ratePerHour;

            if (weeklyHour >= weeklyHourRange) {
                payable = payable + bonusAmount;
                System.out.println("Congratulations! You are eligible for Bonus");
            }
            else{
                System.out.println("You are not eligable for Bonus");
            }
            System.out.println("Total Payable: " + payable);
            System.out.println("Do you want to continue Yes/No: .................");
            controller = scanner.next();
        }




    }
}



