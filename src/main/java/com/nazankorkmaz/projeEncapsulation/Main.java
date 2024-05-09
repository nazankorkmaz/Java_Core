package com.nazankorkmaz.projeEncapsulation;

public class Main {

    public static void main(String[] args) {

        Abone abone = new Abone();
        abone.bakiye =200;
        abone.isim= "Nazan";
        abone.sehir= "İstanbul";

        abone.dogalgac_kullan(200);

        GelismisAbone abone2 = new GelismisAbone("Nazan2",200,"Van");
        abone2.bakiye_ogren();
    }
}
