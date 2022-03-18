public class Results {
    public static void main(String[] args) {
        Info info = new Info("Malle", "Kivi", 16);
        Student hinne = new Student(info, "B");
        String hinneInfo = hinne.getInfo();
        System.out.println(hinneInfo);
    }
}
