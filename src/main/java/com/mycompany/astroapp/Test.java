package com.mycompany.astroapp;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;
import javax.swing.UIManager;

public class Test {
    public static void main(String[] args) {
        try
        {
            UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        JFrame frm = new JFrame();
        var jdc = new JDateChooser();
        JButton btn = new JButton("Click");
        btn.addActionListener(_ -> {
            System.out.println(jdc.getDate());
        });
        JPanel p = new JPanel(new GridLayout(2, 0));
        p.add(jdc);
        p.add(btn);
        frm.add(p);
        frm.pack();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }
}
