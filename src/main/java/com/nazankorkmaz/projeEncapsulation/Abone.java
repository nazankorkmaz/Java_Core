package com.nazankorkmaz.projeEncapsulation;

public class Abone {

    public  String isim;
    public int bakiye;
    public  String sehir;

    //yukardakiler su an encapsulatione aykiri



    public void dogalgac_kullan(int miktar){

        if ((this.bakiye - miktar) <0){
            System.out.println("Yeterli bakiye yok..");
        }
        else {
            this.bakiye-=miktar;

            if(this.bakiye<=0){
                System.out.println("Bakiyeniz bitmiştir"+
                        "Kredi Limiti = 120");
            }
            else {
                System.out.println("Yeni bakiye : "+bakiye);
            }
        }
    }

    public void bakiye_ogren(){
        System.out.println("Bakiye : "+ bakiye);
    }

}
