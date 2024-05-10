package com.nazankorkmaz.programAbstract;

public class Main {

    public static void main(String[] args) {

        // yapılamaz abstract çunku Sekil sekil = new Sekil()

        Kare kare = new Kare("Kare1",5);
        Daire daire = new Daire("Daire1",4);
        kare.alan_hesapla();
        daire.alan_hesapla();

    }

}
