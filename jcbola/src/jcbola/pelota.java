/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pc
 */
package jcbola;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */


public class pelota {

    private Image balon;
    //Coordenadas de la pelota
    public static int xemp=30, yemp=540;
    public static int X;
    public static int Y;
    public static double t=0;
    int a=1, b=1;
    public static int v;
    public static double ang, g=9.8, tmax;

    private int velocidad_X;
    private int velocidad_Y;

    private int limite_izquierda = 0;
    private int limite_derecha;
    private int limite_superior = 0;
    private int limite_inferior;

     public pelota(int x, int y) {
        //coordenadas iniciales
        this.X = x; this.Y = y;
        //imagen de la pelota
        balon = new ImageIcon(getClass().getResource("pelota2.png")).getImage();
    }

    //dado las dimensiones del contendor JPanel
   public void LimitesXY(int width, int height) {
        limite_derecha  = width  - balon.getWidth(null);
        limite_inferior = 560;
    }

   //recalcula variables para dar la sensacion de movimiento
   public void move() {
        //nueva posicion
        velocidad_X = xemp+(int)(v*Math.cos(ang)*t);
        velocidad_Y = yemp-(int)((-0.5*g*t*t)+(v*Math.sin(ang))*t);
        
        X = velocidad_X;
        Y = velocidad_Y;
        t += 0.1;
       /* if(Y<0){
          velocidad_Y= (-1)*velocidad_Y;
        } else
        */if(Y>limite_inferior){
          Y=limite_inferior;
          
        }
        if(X>limite_derecha){
          velocidad_X= (-1)*velocidad_X;
        }
        
        //System.out.println("x: "+X+" Y: "+Y+" t= "+t+" ang= "+ang+" v_X: 40+"+(int)(v*Math.cos(ang)*t));
        //controla que la pelota no salga de los limites del contenedor
        
    }

    public void setVelocidadXY(){
        
    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(balon, X, Y, null);
    }

    //devuelve un número aleatorio entre 1 y MAX
    private int getNumberRandom(int Max){
        return (int) (Math.random()*Max+1);
    }
}