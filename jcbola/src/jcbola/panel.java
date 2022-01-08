/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcbola;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class panel extends JPanel{

    //instancia a la pelota en posicion (X,Y) => (0,0)
    public static int xran;
    private pelota mipelota = new pelota(pelota.xemp, pelota.yemp);
    private canon mican= new canon(-2, 500);
    private pasto mipasto= new pasto(0,582);
    private paisaje mipais = new paisaje(0,0);
    private diana midina= new diana(0,550);
    private Timer timer;

    //Constructor
    public panel(Dimension d) {
        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(new Color(0,255,0));
        mipelota.LimitesXY(getWidth(), getHeight());
        //para la animación
        timer = new Timer(16, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                try {
            Thread.currentThread().sleep(10);
        }
        catch(InterruptedException ie){
            //continue
        }
                if(pelota.Y<560 || pelota.t<1.0){
                mipelota.move();
                repaint();}
                else{
                    //System.out.println("se paro :v");
                    timer.stop();
                }
            }
        });
    }
    
    //Controla el inicio y fin de la animación
    public void animar(boolean turnOnOff) {
        if (turnOnOff) {
            mipelota.setVelocidadXY();
            timer.start();
        } else {
            timer.stop();
        }
    }

    //pinta la animación
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mipais.dibujar(g);        
        mipasto.dibujar(g);
        midina.dibujar(g);
        mipelota.dibujar(g);
        mican.dibujar(g);
    }
    
    

}
