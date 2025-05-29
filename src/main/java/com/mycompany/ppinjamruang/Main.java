import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.ppinjamruang.Login;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package com.mycompany.ppinjamruang;*/

/**
 *
 * @author dyana
 */



public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Tampilkan Login Form dulu
        new Login().setVisible(true);
    }
}

