package methods;

import java.beans.PropertyEditorSupport;

public class average {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        averageNumber(a,b);

    }
    public  static void averageNumber (int a , int b) {
        int result = (a+b) / 2;
        System.out.println(result);
    }
}
