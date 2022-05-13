package com.example.proovikontrolltoo.teineosa;

public class JoogiKastTest {

    @Test
    public void arvutaMass() {
       JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
       Jook jook = new Jook();
       JoogiPudel joogiPudel = new JoogiPudel(12.0, "klaas", 20.0, 0.1);
       joogiPudel.jook = jook;
       joogiKast.joogiPudel = joogiPudel;
       double mass = joogiKast.getMass(20);
       assertEquals(517.69, 0.1);
    }

    @Test
    public void arvutaMassKuiOnRohkemKuiMahub() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook();
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "klaas", 20.0, 0.1);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double mass = joogiKast.getMass(200);
        assertEquals(738.5, 0.1);
    }

    @Test
    public void arvutaHind() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook();
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "klaas", 20.0, 0.1);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double mass = joogiKast.getMass(20);
        assertEquals(220.8, 0.1);
    }

    @Test
    public void villidPudelidKasti() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook();
        JoogiPudel joogiPudel = new JoogiPudel(2.0, "klaas", 20.0, 0.1);
        joogiPudel.jook = jook;
        JoogiVaat joogiVaat = new JoogiVaat(312, 36);
        int kogus = joogiKast.villiKastiPudelid(joogiVaat);
        assertEquals(18, kogus, 0.1);
    }
}
