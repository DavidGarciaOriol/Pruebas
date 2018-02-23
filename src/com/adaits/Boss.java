package com.adaits;

import java.util.ArrayList;

public class Boss {

    private ArrayList<Minion>minions = new ArrayList<>();
    private String nombre;

    public Boss(ArrayList<Minion> minions, String nombre) {
        this.minions = minions;
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMinions(ArrayList<Minion> minions) {
        this.minions = minions;
    }

    public void agregarMinion(Minion minion){
        minions.add(minion);

    }
}
