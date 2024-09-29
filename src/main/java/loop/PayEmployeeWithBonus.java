package loop;

import java.util.Scanner;

public class PayEmployeeWithBonus {
    public static void main(String[] args) {
        int weeklyHourRange = 30;
        double ratePerHour = 10.0;
        double bonusAmount = 2;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< 5; i++){
            System.out.println("Type WeeklyHour new: ");

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
            System.out.println("Type Again: .................");
        }




    }
}



