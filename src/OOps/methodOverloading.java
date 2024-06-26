package OOps;

public class methodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("Shubham");

    }
}
class  Greet {
    void greeting () {
        System.out.println("Hello, Good Morning");
    }
    void greeting(String name) {
        System.out.println("Hello "+name+" Good Morning");
    }
}
