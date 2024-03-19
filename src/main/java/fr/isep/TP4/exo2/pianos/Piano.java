package fr.isep.TP4.exo2.pianos;

import fr.isep.TP4.exo2.InstrumentCorde;

public class Piano extends InstrumentCorde {

    protected int nombreTouches = 88;

    public Piano () {}

    public int getNombreTouches() {
        return nombreTouches;
    }

    public void setNombreTouches(int nombreTouches) {
        this.nombreTouches = nombreTouches;
    }
}
