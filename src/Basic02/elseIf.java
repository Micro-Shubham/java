package Basic02;

import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number ");
        int day = sc.nextInt();
        if(day == 1) {
            System.out.println("Its mondey");
        } else if(day ==2) {
            System.out.println("Its Tuesday");
        } else if(day ==3) {
            System.out.println("Its Wednesday");
        } else if(day ==  4) {
            System.out.println("Its Thrusday");
        } else {
            System.out.println("That's wrong input");
        }

    }
}
