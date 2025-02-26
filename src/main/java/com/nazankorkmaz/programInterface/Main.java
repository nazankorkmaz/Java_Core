package com.nazankorkmaz.programInterface;

public class Main {

    public static void main(String[] args) {
        // IMuhendis muhendis = new IMuhendis()
        // bunu yapamıyoruz maalesef

        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_kaydi();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.78));

        String[] tecrube = {"Baykar","Demsay"};
        muhendis1.is_tecrubesi(tecrube);

        IMuhendis muhendis2 = new PcMuhendisi(true, true);
        //Ama boyle verebilirisin referansini
        // muhendis2.deneme() gelmedi mesela
        // part 2

        MakineMuhendisi muhendis3 = new MakineMuhendisi(true, false);

        String[] tecrube2 ={};
        String[] referans2 ={"Tugba Gulse","Birini daha bulcaz jnscksjndc"};
        muhendis3.adli_sicil_kaydi();
        muhendis3.askerlik_durumu_sorgula();
        System.out.println(muhendis3.mezuniyet_ortalamasi(3.8));
        muhendis3.is_tecrubesi(tecrube2);
        muhendis3.referans_getir(referans2);

        //ama buna IMuhendisi veremezsin referans olrak çünkü farklı method ekledik referanslar diye

        muhendis3.calis();
    }


}
