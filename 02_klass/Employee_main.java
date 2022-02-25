public class Employee_main {
    public static void main(String[] args) {
        Employee one = new Employee("Mari", "Tamme", 49201156233, 30);
        Employee two = new Employee("Maria", "Kivi", 49201164277, 30);
        System.out.println(one);
        System.out.println(two);
        one.palk();
        two.palk();
}
