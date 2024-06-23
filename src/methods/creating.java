package methods;

public class creating {
    public static void main(String[] args) {
        System.out.println(createRandom());
    }
    public static int createRandom () {
        int data = (int) (Math.random()*6);
        return data;
    }
}
