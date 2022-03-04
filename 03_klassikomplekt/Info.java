public class Info {
    String nimi;
    String perekonnanimi;
    int vanus;


    public Info(String nimi, String perekonnanimi, int vanus) {
        this.nimi = nimi;
        this.perekonnanimi = perekonnanimi;
        this.vanus = vanus;
    }

    @Override
    public String toString() {
        return "Info{" +
                "nimi='" + nimi + '\'' +
                ", perekonnanimi='" + perekonnanimi + '\'' +
                ", vanus=" + vanus +
                '}';
    }
}
