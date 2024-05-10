package com.nazankorkmaz.programInterface;

public class MakineMuhendisi implements IMuhendis, ICalisma {

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {

        if (askerlik){

            System.out.println("Askerliğimi Yaptım.");

        }
        else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam : "+derece;
    }


    @Override
    public void adli_sicil_kaydi() {
        if (adli_sicil) {
            System.out.println("Adli Sicil Kaydım Bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");

        }
    }

    @Override
    public void is_tecrubesi(String[] array) {

        if (array.length == 0 ) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor...");
        }
        else {

            System.out.println("Makine Mühendisi olarak şu şirketlerde çalıştım.");
            for (int i = 0 ; i < array.length ;i++) {
                System.out.println(array[i]);

            }
        }
    }

    public void referans_getir(String[] array){

        if(array.length ==0){
            System.out.println("Hrehangi bir referansim bulunmuyor");
        }
        else {
            System.out.println("Referanslarim:");
            for (int i = 0 ; i < array.length ;i++) {
                System.out.println(array[i]);

            }
    }
}

    @Override
    public void calis() {
        System.out.println("MAkine muhendisi calisiyor");
    }
}
