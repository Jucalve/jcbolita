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
public class paisaje {
    private Image pais;
  private int X;
    private int Y;
    public paisaje(int x, int y) {
        //coordenadas iniciales
        this.X = x; this.Y = y;
        //imagen de la pelota
        pais = new ImageIcon(getClass().getResource("paisaje2.png")).getImage();
    }
    
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(pais, X, Y, null);
    }
}
