/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.astroapp;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author naksh
 */
public class AstroApp extends JFrame{
    
    AstroApp() 
    {
        this.setTitle("AstroApp");

        JTabbedPane jTabbedPane = new JTabbedPane();

        jTabbedPane.addTab("Chart House Position", new ChartPosition());
        jTabbedPane.addTab("Planet Chart Details", new GetPlanetChartDetails());
//        jTabbedPane.addTab("Planetary Friendship", new PlanetaryFriendship());
        jTabbedPane.addTab("Nakshatra and Lords", new NakshatraAndTheirLords());
        jTabbedPane.addTab("KP House Chart", new KPChart());
        
        jTabbedPane.addChangeListener( _ -> {
            this.revalidate();
        });

        this.add(jTabbedPane);
    }

    public static void main(String[] args) {
        
        try
        {
            UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        var app = new AstroApp();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setLocationRelativeTo(null);
//        app.setResizable(false);
        app.setVisible(true);
    }
}

