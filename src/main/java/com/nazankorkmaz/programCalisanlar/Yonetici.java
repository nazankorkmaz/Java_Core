package com.nazankorkmaz.programCalisanlar;

public class Yonetici extends Calisan{

    private int  sorumlu_kisi_sayisi;
    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        sorumlu_kisi_sayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : "+sorumlu_kisi_sayisi);
    }

    public void zamYap(int zamMiktari){
        System.out.println(getAd()+ " çalışanların "+zamMiktari+ "kadar zam yapıyor.....");
    }
}
