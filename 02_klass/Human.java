public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;

    public Human(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.mees = mees;
    }

    // to ---> võtan toStringi() --> enter

    public void sayHello() {
        System.out.println(nimi + "ütleb tere!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", mees=" + mees +
                '}';
    }


}
