package com.adaits;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestBoss {

    static Boss boss;
    static Minion[] minions;



    @BeforeAll
    static void crearPersonas() {
        minions = new Minion[10];
        minions[0] = new Minion(0, true);
        minions[1] = new Minion(0, false);
        minions[2] = new Minion(1, true);
        minions[3] = new Minion(1, false);
        minions[4] = new Minion(2, true);
        minions[5] = new Minion(2, false);
        minions[6] = new Minion(3, true);
        minions[7] = new Minion(3, false);
        minions[8] = new Minion(-1, false);
        minions[9] = new Minion(-1, true);
    }

    @Test
    void probar(){
        ArrayList<Minion> minions = new ArrayList<>();
        Boss boss1 = new Boss(minions, "Pepe");
            boss1.agregarMinion();
    }
}
