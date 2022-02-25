public class Main {
    public static void main(String[] args) {
        Human one = new Human("Mari", 25, 1.7, false);
        Human two = new Human("Maria", 23, 1.72, true);
        System.out.println(one);
        System.out.println(two);
        one.sayHello();
        two.sayHello();
    }
}
