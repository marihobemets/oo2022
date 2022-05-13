package com.example.proovikontrolltoo;

public class Pendel {
    double pikkus;
    Hammasratas hammasratas1;
    Hammasratas hammasratas2;
    Hammasratas hammasratas3;

    public Pendel(double _pikkus, Hammasratas _hammasratas1, Hammasratas _hammasratas2, Hammasratas _hammasratas3) {
        this.pikkus = _pikkus;
        this.hammasratas1 = _hammasratas1;
        this.hammasratas2 = _hammasratas2;
        this.hammasratas3 = _hammasratas3;
    }

    public double getPikkus() {
        return pikkus;
    }

    public double v6nkeperiood(){
        return 2 * Math.PI * (getPikkus()/9.8);
    }

}
