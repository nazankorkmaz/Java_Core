package com.nazankorkmaz.programBilgisayar_Composition;

public class Test {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197DE","ASUS","18.5",resolution);

        Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli Cam");

        Anakart anakart = new Anakart("B250-PRO","Asus",10,"Windows 10");

        Bilgisayar pc = new Bilgisayar(kasa, monitor,anakart);

        pc.getKasa().bilgisayari_ac();  //composition
        //iç içe referanslarla fonksiyonlara ulaştık
        // getKasa kasa nesnesi dönecek ve o nesne bilgisayarı açmaya gidecek
        kasa.bilgisayari_ac();

        pc.getMonitor().monitoru_kaoat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 20.8");




    }


}
