public class explicitconversion {
    public static void main(String[] args) {
        //converting int data to byte
        int age = 150;
        System.out.println(age);
        //there will loss of data
        byte newAge = (byte) age;
        System.out.println(newAge);

    }
}
