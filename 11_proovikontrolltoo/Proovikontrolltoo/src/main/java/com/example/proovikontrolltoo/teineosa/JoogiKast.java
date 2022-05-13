package com.example.proovikontrolltoo.teineosa;

public class JoogiKast {
    String kastiTyyp;
    double kastiHind;
    double kastiMass;
    int pesad;
    JoogiPudel joogiPudel;

    public JoogiKast(String kastiTyyp, double kastiHind, double kastiMass, int pesad) {
        this.kastiTyyp = kastiTyyp;
        this.kastiHind = kastiHind;
        this.kastiMass = kastiMass;
        this.pesad = pesad;
    }

    public double getMass(int jookideArv) {
        if (jookideArv > pesad) {
            jookideArv = pesad;
            System.out.println("Jookide arv oli suurem kui pesade arv," + "võtan kasutusele " + pesad + " jooki" );
        }if (joogiPudel == null){
                return kastiMass;
        } else {
                return kastiMass + (joogiPudel.mass  + joogiPudel.jook.erikaal * joogiPudel.maht) + jookideArv;
        }
    }

    public double getHind(int jookideArv) {
        if (jookideArv > pesad) {
            jookideArv = pesad;
            System.out.println("Jookide arv oli suurem kui pesade arv," + "võtan kasutusele " + pesad + " jooki");
        }
        if (joogiPudel == null) {
            return kastiMass;
        } else {
            return kastiMass + (joogiPudel.taaraMaksumus + joogiPudel.jook.erikaal*joogiPudel.jook.omahind) + jookideArv;
        }
    }

    public int villiKastiPudelid(JoogiVaat joogiVaat) {
        int loendur = 0;
        while(joogiVaat.liitritesJooki >= joogiPudel.maht) {
            //liitritesJooki -= liitritesJooki - joogiPudel;
            joogiVaat.liitritesJooki -= joogiPudel.maht;
            loendur++;
            if (loendur == pesad) {
                System.out.println("Lõpetasin villimise, kuna sai täis");
                break;
            }
        }
        System.out.print("Villisid" + loendur + " jooki");
        return loendur;
    }
}
