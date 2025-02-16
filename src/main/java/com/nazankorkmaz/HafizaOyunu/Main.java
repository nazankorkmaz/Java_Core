package com.nazankorkmaz.HafizaOyunu;

import java.util.Scanner;

public class Main {
    public static Kart[][] kartlar = new Kart[4][4];
    // static yaptik ve classa ait oldu yani maindeki kartlar hata vermedi artik
    public static void main(String[] args) {

        kartlar [0][0] = new Kart('E');
        kartlar [0][1] = new Kart('A');
        kartlar [0][2] = new Kart('B');
        kartlar [0][3] = new Kart('F');
        kartlar [1][0] = new Kart('G');
        kartlar [1][1] = new Kart('A');
        kartlar [1][2] = new Kart('D');
        kartlar [1][3] = new Kart('H');
        kartlar [2][0] = new Kart('F');
        kartlar [2][1] = new Kart('C');
        kartlar [2][2] = new Kart('D');
        kartlar [2][3] = new Kart('H');
        kartlar [3][0] = new Kart('E');
        kartlar [3][1] = new Kart('G');
        kartlar [3][2] = new Kart('B');
        kartlar [3][3] = new Kart('C');


        while(oyunBittiMi() == false){
            oyunTahtasi();
            tahminEt();
        }

    }

    public static void oyunTahtasi() {
        for (int i = 0; i<4;i++){
            System.out.println("_______________________");
            for ( int j =0;j<4;j++){

                if (kartlar[i][j].isTahmin()){
                    System.out.println("  |  " + kartlar[i][j].getDeger() + "|  ");
                }else{
                    System.out.println("  |  |  ");
                }
            }

        }
        System.out.println("_______________________");

    }

    public static boolean oyunBittiMi(){
        for (int i =0; i<4; i++){
            for (int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()== false){
                    return  false;
                }
            }
        }
        return true;
    }

    public static  void tahminEt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci tahmin (i ve j değerlerini bir boşlukla girin....):");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.println("İkinci tahmin (i ve j değerlerini bir boşlukla girin....):");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            kartlar[i2][j2].setTahmin(true);
            System.out.println("**** Tahmin doğru ****");
        }else{
            kartlar[i1][j1].setTahmin(false);
            kartlar[i2][j2].setTahmin(false);
            System.out.println("!!!! Tahmin yanlış !!!!");


        }
    }
}
