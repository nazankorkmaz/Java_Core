package com.nazankorkmaz.LinkedList;

import java.awt.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static  void listeyi_bastir(LinkedList<String> gidilecek_yerler){

        //for each dongusu
        for(String s: gidilecek_yerler){
            System.out.println(s);
        }

        System.out.println("-------------Iterator ile-------------");
        // Iterator'dan farklı olarak, ListIterator ile geri gitmek (previous) ve listeyi değiştirmek mümkündür.
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while(iterator.hasNext()){ // bir sonraki eleman var mı? kontrolü yapar.
            System.out.println(iterator.next());  // bir sonraki elemanı döndürür ve iterator'un konumunu ilerletir.
        }
    }

    public  static  void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while(iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);
            if (karsilastir == 0) {
                // İki değer eşit
                System.out.println("Listeniz bu eleman zaten var....");

                return;

            }
            else if (karsilastir  < 0) {

                // Yeni değer iterator.next ten daha büyük.
            }
            else if (karsilastir > 0 ) {

                iterator.previous();  // onceki konuma git ve araya ekle
                iterator.add(yeni);

                return;

            }

        }
        iterator.add(yeni);

    }

    public static void main(String[] args) {
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        gidilecek_yerler.add("Postane");

        gidilecek_yerler.add("Market");

        gidilecek_yerler.add("Okul");

        gidilecek_yerler.add("Kütüphane");

        gidilecek_yerler.add("Spor Salonu");

        gidilecek_yerler.add("Ev");


        listeyi_bastir(gidilecek_yerler);

        System.out.println("----------------------------------------------");

        gidilecek_yerler.add(4,"Alışveriş Merkezi");
        gidilecek_yerler.remove(3);
        listeyi_bastir(gidilecek_yerler);

        System.out.println("Son-----------");
        LinkedList<String> yerler = new LinkedList<String>();
        sirali_ekle(yerler, "Anaokulu");
        sirali_ekle(yerler,"Market");
        sirali_ekle(yerler,"Hapishane");
        listeyi_bastir(yerler);
    }
}
