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
public class diana {
    private final Image dia;
    public static int X;
    private final int Y;
    public diana(int x, int y) {
        //coordenadas iniciales
        //this.X = (int) (Math.random()* (590 - 1300) + 1300; 
        this.Y = y;       
        System.out.println("x= " + X);
        //imagen de la pelota
        dia = new ImageIcon(getClass().getResource("diana1.png")).getImage();
    }

    public static int getX() {
        return X;
    }

    public static void setX(int X) {
        diana.X = X;
    }
    
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g; 
        g2.drawImage(dia, X, Y, null);
    }
}
