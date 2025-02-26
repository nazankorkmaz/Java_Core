package com.nazankorkmaz.upDownCasting;

class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor");
    }
}

public class Main {
    public static void main(String[] args) {
        Hayvan hayvan = new Kedi();  // Upcasting (otomatik)
        hayvan.sesCikar();          // Hayvan metoduna erişilir
        // hayvan.miyavla();        //  Hata! Alt sınıf metoduna erişilemez


        Hayvan hayvan2 = new Kedi();   // Upcasting
        Kedi kedi = (Kedi) hayvan2;   // Downcasting (manuel)

        kedi.sesCikar();             // Üst sınıf metoduna erişilir
        kedi.miyavla();              // Alt sınıf metoduna erişilir


    }
}
