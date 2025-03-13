package com.nazankorkmaz.SingersProject;

import java.util.Scanner;

public class Test {

    private static  Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public  static  void islemleri_bastir(){
        System.out.println("\t 0-İşlemleri görüntüle..");
        System.out.println("\t 1-Sarkıcıları görüntüle..");
        System.out.println("\t 2-Sarkıcı eklen..");
        System.out.println("\t 3-Sarkıcı güncelle..");
        System.out.println("\t 4-Sarkıcı sil..");
        System.out.println("\t 5-Sarkıcı ara..");
        System.out.println("\t 6-Uygulamadan çık..");

    }
    public static  void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();
    }
    public static void sarkici_ekle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismi: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle(){
        System.out.println("Güncellemk istediğiniz pozisyon(1,2,3)");
        int pozisyon= scanner.nextInt();
        scanner.nextLine();
        String yeni_isim = scanner.nextLine();

        sarkicilar.sarkici_guncelle(yeni_isim,pozisyon-1);
    }
    public static void sil(){
        System.out.println("Silmek istediğiniz pozisyon(1,2,3):");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);
    }

    public static void ara(){
        System.out.println("Araamk istediğiniz şarkıcı:");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args) {
        System.out.println("\t Sarkıcı Uygulamasına Hoşgeldiniz...");
        islemleri_bastir();
        boolean cikis = false;
        int islem ;
        while (!cikis){
            System.out.println("Bir işlem seçiniz");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan çıkılıyor....");
                    break;
            }

            Sarkicilar.sarkici_ekle2("staticli olan ");
        }
    }
}
class A extends  Test{
    public void yeni(){
        Test.sarkici_ekle();

    }
}
