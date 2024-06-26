package OOps;

public class classandObject {
    public static void main(String[] args) {
        //creating object
        dog d1 = new dog();
        d1.age = 1;
        d1.legs = 4;
        d1.bark();
        d1.walk();

    }
}
//create a class
class dog  {
    //make some property
    String name;
    int age ;
    int legs;
    //behaiviour
    void bark() {
        System.out.println("Dog is barking");
    }
    void walk() {
        System.out.println("The dog walk on four legs ");
    }
}
