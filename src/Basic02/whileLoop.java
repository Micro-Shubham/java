package Basic02;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the number ");
        int table = sc.nextInt();
        int i = 1;
        while(i<10)
        {
            int mul = table * i;
            System.out.println(mul);
            i++;
        }
    }
}
