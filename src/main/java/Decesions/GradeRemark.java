package Decesions;

import java.util.Scanner;

public class GradeRemark {
        public static void main(String[] args) {
            System.out.println("Type Grade");

            Scanner sc = new Scanner(System.in);
            String grade = sc.next();
            String msg;

            switch (grade) {
                case "A":
                    msg = "You got 3.75";
                    break;
                case "B":
                    msg = "You got 3.00";
                    break;
                case "C":
                    msg = "You got 2.90";
                    break;
                case "D":
                    msg = "You got 2.50";
                    break;
                default:
                    msg = "Not Matched";


            }

            System.out.println(msg);


        }
}
