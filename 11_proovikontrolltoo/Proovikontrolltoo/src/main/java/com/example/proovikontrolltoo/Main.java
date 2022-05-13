package com.example.proovikontrolltoo;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        double pendliPikkus = 0.2;
        Hammasratas hammasratas1 = new Hammasratas(60, 15);
        Hammasratas hammasratas2 = new Hammasratas(60, 30);
        Hammasratas hammasratas3 = new Hammasratas(12, 40);
        Pendel pendel = new Pendel(pendliPikkus, hammasratas1, hammasratas2, hammasratas3);
        System.out.println(pendel.v6nkeperiood());
        boolean isLeft = false;
        int counter = 0;
        int ringid1 = 0;
        int ringid2 = 0;

        System.out.println("Pendli suurus: " + pendliPikkus);
        System.out.println(" Esimese hammasratta suurus: " + pendliPikkus);
        System.out.println("Teise hammasratta suurus: " + pendliPikkus);
        System.out.println("Kolmanda hammasratta suurus: " + pendliPikkus);
        System.out.printf("Minu kella suurus: %.2f", (pendliPikkus + hammasratas1.suurus + hammasratas2.suurus + hammasratas3.suurus));

        while (true) {
            TimeUnit.MILLISECONDS.sleep((long) (pendel.v6nkeperiood()*1000/2));
            if (isLeft) {
                System.out.println("PENDEL VASAKUL");
                isLeft = false;
                counter++;
            } else {
                System.out.println("PENDEL PAREMAL");
                isLeft = true;
                counter++;
            }
            if(hammasratas1.hambad == counter) {
                ringid1++;
                counter = 0;
                if (hammasratas2.hambad == ringid1) {
                    ringid2++;
                }
            }
            System.out.println("Kell:");
            System.out.println(ringid2 + ".");
            System.out.println(ringid1 + ".");
            System.out.println(counter);
        }
    }
}
