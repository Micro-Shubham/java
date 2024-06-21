package Basic02;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the number ");
        int table = sc.nextInt();
        int i =1 ;
        do{
            int mul = table *i;
            System.out.println(mul);
            i++;
        } while(i <= 10);
    }
}
