/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcbola;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author pc
 */
public class pasto {
    private Image pas;
  private int X;
    private int Y;
    public pasto(int x, int y) {
        //coordenadas iniciales
        this.X = x; this.Y = y;
        //imagen de la pelota
        pas = new ImageIcon(getClass().getResource("pasto.png")).getImage();
    }
    
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(pas, X, Y, null);
    }
}
