package basic;

import java.util.Scanner;

public class EmployeePay {
    public static void main(String[] args) {
        System.out.println("Employee's Hour : ");

        Scanner scanner = new Scanner(System.in);
        int hour =  scanner.nextInt();
        System.out.println("Employee's Rate : ");
        double rate = scanner.nextDouble();
        scanner.close();
        double pay = hour * rate;
        System.out.println("Employee Pay : "+pay);

    }
}
