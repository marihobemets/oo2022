public class Employee_main {
    public static void main(String[] args) {
        Employee one = new Employee("Mari", "Tamme", 30);
        Employee two = new Employee("Maria", "Kivi",  30);
        System.out.println(one);
        System.out.println(two);
        one.palk();
        two.palk();
    }
}
