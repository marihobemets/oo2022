package com.example.proovikontrolltoo.teineosa;

public class JoogiPudel {
    double maht;
    String pudelTyhi;
    double mass;
    double taaraMaksumus;
    Jook jook;

    public JoogiPudel(double maht, String pudelTyhi, double mass, double taaraMaksumus) {
        this.maht = maht;
        this.pudelTyhi = pudelTyhi;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
    }

    public double getMass() {
        if (jook == null) {
            return mass;
        } else {
            return mass + jook.erikaal;
        }
    }

    public double getKoguhind() {
        if (jook == null) {
            return taaraMaksumus;
        } else {
            return taaraMaksumus + jook.erikaal*jook.omahind;
        }
    }
}
