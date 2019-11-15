/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.utilidades;

import co.com.principal.FrmGraficos2d;
import static co.com.utilidades.ConexionArduinoJava.listener;
import static co.com.utilidades.ConexionArduinoJava.pa;
import com.panamahitek.ArduinoException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;

/**
 *
 * @author FABIO
 */
public class Circunferencia extends Vector{
    protected double radio = 1.0;
    public Circunferencia(double x0, double y0, Color color){
        super(x0,y0,color);        
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void encender(BufferedImage canvas) {
        double t =0.0;
        double dt = 0.001;
        //dt(t)= [xc + r *Cos(t), yc+r*sen(t)] ==> dominio t E(0 ,2p1)
        Vector v = new Vector(x0, y0, color);
        do{
            v.x0 = this.x0 + radio * Math.cos(t);
            v.y0 = this.y0 + radio * Math.sin(t);
            v.encender(canvas);
            t += dt;
        }while(t<=2 *Math.PI);
    }
    
    public void interpolar(int rojo, int verde, int azul) {

        try {
            pa.arduinoRX("COM8", 9600, listener);
        } catch (ArduinoException ex) {

            ex.printStackTrace();
        } catch (SerialPortException ex) {
            Logger.getLogger(FrmGraficos2d.class.getName()).log(Level.SEVERE, null, ex);
        }

//        Circunferencia c = new Circunferencia();
//        double x = 0;
//        double dx = 0.10;
//        /*int rojo = 0;//c1;
//        int verde = 0;//c2;
//        int azul = 0;//c3;*/
//        do {
//
//            if (x >= 5) {
//                x = 0;
//                rojo = 0;//c1;
//                verde = 0;//c2;
//                azul = 0;//c3;
//                //areaDibujo.limpiar();
//                c.setColor(areaDibujo.getForeground());
//                c.apagar(canvas);
//            }
//            //1 puede ir de 1 a 400
//            //cuando x vale 1 el primer color tendra 255 y cuando llegue a 5 tendra 180
//
//            if (rojo >= 0 && rojo <= 255) {
//                //rojo = (int) Util.interpolarDosPuntos(x, 1.0, 255.0, 5, 180.0);//Color rojo c1
//                System.out.println("===> " + red);
//                rojo = (int) Util.interpolarDosPuntos(x, 1, red, 5, 180.0);//Color rojo c1
//                rojo = redondeo(rojo);
//            }
//            if (verde >= 0 && verde <= 255) {
//                //verde = (int) Util.interpolarDosPuntos(x, 1.0, 20.0, 5.0, 255.0);//Verde c2
//                //System.out.println("===> "+red);
//                verde = (int) Util.interpolarDosPuntos(x, 1, red, 5.0, 255.0);//Verde c2
//                verde = redondeo(verde);
//            }
//            if (azul >= 0 && azul <= 255) {
//                //azul = (int) Util.interpolarDosPuntos(x, 1.0, 180.0, 5.0, 0.0);//Azul c3
//                //System.out.println("===> "+red);
//                azul = (int) Util.interpolarDosPuntos(x, 1, red, 5.0, 0.0);//Azul c3
//                azul = redondeo(azul);
//            }
//
//            c.setColor(new Color(rojo, verde, azul));
//            c.setX0(x);
//            c.setY0(0.0);
//            c.setRadio(x);
//            c.encender(canvas);
//            areaDibujo.pintar(canvas);
//            x += dx;            
//        } while (true);
//*********************************************************** 
        double x = 0;
        while (true) {
            //red = 255;
            
            if (x >= 5) {
                x = 0;
                rojo = 0;//c1;
                verde = 0;//c2;
                azul = 0;//c3;
                //areaDibujo.limpiar();
//                c.setColor(areaDibujo.getForeground());
//                c.apagar(canvas);
            }

        }
    }
    
}
