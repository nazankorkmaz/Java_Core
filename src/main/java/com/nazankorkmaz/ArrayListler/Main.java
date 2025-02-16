package com.nazankorkmaz.ArrayListler;

import java.util.ArrayList;

public class Main {

    // Arraylerin genisletilmis hali yani boyutu sabit degil degistirilebilir
    // arrayler sadece tek tip value aliyordu yani sadece int mesela


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        // <> bu genericsdir yani hangi türde eleman tutacagını yazarsın diamaond operator
        arrayList.add("maNga");
        arrayList.add("Metalica");
        arrayList.add("Grup 1");

        System.out.println(arrayList.get(0));
        System.out.println("Uzunluğu :" + arrayList.size());

        for (int i =0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));

        }

        arrayList.remove(2); // ya da "Grup 1 " yazarsin
        System.out.println("Uzunluğu :" + arrayList.size());


        System.out.println(arrayList.indexOf("maNga"));
        arrayList.add("maNga");
        System.out.println(arrayList.lastIndexOf("maNga")); // son gordugunu verir

        arrayList.set(2,"maNga 2"); // guncellendi
        System.out.println(arrayList.get(2));

        yazdir(arrayList);
    }

    public static void yazdir(ArrayList<String> a) {
        for(int i = 0; i<a.size();i++){
            System.out.println("Element "+ (i+1)+": "+a.get(i));
        }
    }
}
