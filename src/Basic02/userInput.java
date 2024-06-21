package Basic02;
//import scanner object
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = input.nextInt();
        System.out.println(" Your entered age is " +age);
    }
}
