package com.example.proovikontrolltoo.teineosa;

import java.io.ByteArrayOutputStream;

public class JoogivaatTests {

    @Test
    public void t2idaPudelKuiSaab() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        JoogiVaat joogiVaat = new JoogiVaat(12.0, 0.5);
        boolean isT2idetud = joogiVaat.t2idaJoogipudel(joogiPudel);
        assertTrue(isT2idetud);
    }

    @Test
    public void t2idaPudelKuiEiSaa() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        JoogiVaat joogiVaat = new JoogiVaat(12.0, 0.3);
        boolean isT2idetud = joogiVaat.t2idaJoogipudel(joogiPudel);
        assertFalse(isT2idetud);
    }

    @Test
    public void villidaEiMahu() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        JoogiVaat joogiVaat = new JoogiVaat(12.0, 0.3);
        int pudeliteArv = joogiVaat.villiPudelid(joogiPudel);
        assertEquals(0, pudeliteArv);
    }

    @Test
    public void villidaMahub() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        JoogiVaat joogiVaat = new JoogiVaat(12.0, 0.3);
        int pudeliteArv = joogiVaat.villiPudelid(joogiPudel);
        assertEquals(6, pudeliteArv);
    }
}
