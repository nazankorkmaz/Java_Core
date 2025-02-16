package com.nazankorkmaz.SingersProject;

import javax.swing.*;

public class SwingOrnek {
    public static void main(String[] args) {
        // Swing bileşenlerini ana thread dışında çalıştır
        SwingUtilities.invokeLater(() -> {
            // Yeni bir pencere oluştur
            JFrame pencere = new JFrame("Swing ornek");

            // Bir buton ekleyelim
            JButton buton = new JButton("Tikla!");
            pencere.add(buton);

            // Pencere ayarları
            pencere.setSize(400, 300);
            pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pencere.setVisible(true);
        });
    }
}
