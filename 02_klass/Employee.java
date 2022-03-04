public class Employee {
    String eesnimi;
    String perekonnanimi;
    int vanus;
    boolean sugu;
    String telefoninumber;
    String aadress;
    double tunnitasu;
    double tunnid;


    public Employee (String eesnimi, String perekonnanimi, int vanus, boolean sugu, String telefoninumber, String aadress, double tunnitasu, double tunnid) {
        this.eesnimi  = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.vanus = vanus;
        this.sugu = sugu;
        this.telefoninumber = telefoninumber;
        this.aadress = aadress;
        this.tunnitasu = tunnitasu;
        this.tunnid = tunnid;
    }
    public void palk() {
        System.out.println(eesnimi + perekonnanimi + "saab lepiguliselt brutopalka" +(tunnitasu*tunnid) +"euri.");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "eesnimi='" + eesnimi + '\'' +
                ", perekonnanimi='" + perekonnanimi + '\'' +
                ", vanus=" + vanus +
                ", sugu=" + sugu +
                ", telefoninumber='" + telefoninumber + '\'' +
                ", aadress='" + aadress + '\'' +
                ", tunnitasu=" + tunnitasu +
                ", tunnid=" + tunnid +
                '}';
    }
}
