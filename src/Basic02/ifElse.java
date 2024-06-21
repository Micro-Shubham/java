package Basic02;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age ");
        int age = sc.nextInt();
        if(age>=18) {
            System.out.println("You can vote in election");
        } else {
            System.out.println("You can't vote in election ");
        }
    }
}
