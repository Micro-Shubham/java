package Basic02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = sc.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println( " The sum is " + result);

    }


}
