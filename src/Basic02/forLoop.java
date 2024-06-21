package Basic02;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int table = sc.nextInt();
        for(int i = 1 ; i <=10; i++) {
            int mult = table * i ;
            System.out.println(mult);
        }
    }
}
