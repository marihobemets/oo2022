public class Employee {
    String eesnimi;
    String perekonnanimi;
    long isikukood;
    int vanus;
    boolean sugu;
    String telefoninumber;
    String aadress;
    double tunnitasu;
    double tunnid;


    public Employee (String eesnimi, String perekonnanimi, long isikukood, int vanus, boolean sugu, String telefoninumber, String aadress, double tunnitasu, double tunnid) {
        this.eesnimi;
        this.perekonnanimi;
        this.isikukood;
        this.vanus;
        this.sugu;
        this.telefoninumber;
        this.aadress;
        this.tunnitasu;
        this.tunnid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eesnimi='" + eesnimi + '\'' +
                ", perekonnanimi='" + perekonnanimi + '\'' +
                ", isikukood=" + isikukood +
                ", vanus=" + vanus +
                ", sugu=" + sugu +
                ", telefoninumber='" + telefoninumber + '\'' +
                ", aadress='" + aadress + '\'' +
                ", tunnitasu=" + tunnitasu +
                ", tunnid=" + tunnid +
                '}';
}
