public class Student {
    Info info;
    String hinne;

    public Student(Info info, String hinne) {
        this.info = info;
        this.hinne = hinne;
    }


    public String getInfo() {
        return "Õpilane andmetega:" + this.info + ". Sai hindeks -" + this.hinne;
    }
}
