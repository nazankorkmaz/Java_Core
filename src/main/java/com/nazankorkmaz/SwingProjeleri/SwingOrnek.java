package com.nazankorkmaz.SwingProjeleri;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class SwingOrnek {
    public static void main(String[] args) {
        // Pencere oluştur
        JFrame frame = new JFrame("Merhaba Uygulaması");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        Desktop d = Desktop.getDesktop();
        // Metin alanı oluştur
        JTextField textField = new JTextField(15);

        // Buton oluştur
        JButton button = new JButton("Tıkla");

        // Sayaç değişkeni
        final int[] clickCount = {0};

        // Buton tıklama olayını ayarla
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount[0]++;  // Sayaçı artır
                //textField.setText("Merhaba");
                System.out.println("Butona " + clickCount[0] + " kez tıklandı.");
                String internet_adresi = textField.getText();
                try {
                    d.browse(new URI(internet_adresi));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        // Bileşenleri ekle
        frame.add(textField);
        frame.add(button);

        // Pencereyi görünür yap
        frame.setVisible(true);
    }

}
