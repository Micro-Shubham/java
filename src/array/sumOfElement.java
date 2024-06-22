package array;

public class sumOfElement {
    public static void main(String[] args) {
        int number[] = {23, 45,56,67,87, 89};
        int sum = 0;
        for(int temp : number) {
            sum+=temp;
        }
        System.out.println("Total sum is " + sum);
    }
}
