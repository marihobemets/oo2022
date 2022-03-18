public class Class {

    public void Grade(int Test, String name) {
        if (Test >= 90 && Test <=100) {
            System.out.println(name+" - hinne A");
        } else if (Test >= 80 && Test <90) {
            System.out.println(name + " - hinne B");
        } else if (Test >= 70 && Test <80) {
            System.out.println(name + " - hinne C");
        } else if (Test >= 60 && Test <70) {
            System.out.println(name + " - hinne D");
        } else if (Test >= 50 && Test <60) {
            System.out.println(name + " - hinne E");
        } else {
            System.out.println(name+" - hinne F");
        }
    }
}
