package com.nazankorkmaz.programBilgisayar_Composition;

public class Bilgisayar {

    private Monitor monitor;
    private Anakart anakart;
    private Kasa kasa;

    public Bilgisayar(Kasa kasa, Monitor monitor, Anakart anakart) {
        this.kasa = kasa;
        this.monitor = monitor;
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
}
