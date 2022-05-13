package com.example.proovikontrolltoo;

public class Hammasratas {
    int hambad;
    double suurus;

    public Hammasratas(int _hambad, double mm) {
        this.hambad = _hambad;
        this.suurus = hambad * mm;
    }

    public int getHambad() {
        return hambad;
    }
}
