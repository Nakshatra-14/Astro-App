/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astroapp;

import java.awt.Graphics;

/**
 *
 * @author naksh
 */
public class Chart {

    public static void makeChart(Graphics g, int height, int width)
        {
            int ymid = (height / 2);
            int xmid = (width / 2);

            g.drawLine(166, ymid - (ymid - 30), 166, ymid + (ymid - 30));
            g.drawLine(328, ymid - (ymid - 30), 328, ymid + (ymid - 30));

            g.drawLine(xmid - (xmid - 30), 166, xmid + (xmid - 30), 166);
            g.drawLine(xmid - (xmid - 30), 328, xmid + (xmid - 30), 328);

            g.drawLine(50, 50, 165, 165);
            g.drawLine(50+280, 50+280, 165+280, 165+280);

            g.drawLine(50+394, 50, 165+163, 166);
            g.drawLine(166, 328, 50, 444);

        }

}
