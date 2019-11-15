/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.utilidades;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author FABIO
 */
public class Vector extends ModelosMatematicos{
    //Coordenadas donde quiere que se pinte en x y en y
    protected Double x0;
    protected Double y0;
    protected Color color;

    public Vector(Double x0, Double y0, Color color) {
        this.x0 = x0;
        this.y0 = y0;
        this.color = color;
    }

    public Vector() {
        this.x0 = 0.0;
        this.y0 = 0.0;
        this.color = Color.BLACK;
    }
    
    //Recibe de mapaa de bits
    public void encender(BufferedImage canvas){
        pantalla(x0,y0);
        //System.out.println("==> x "+sx+" ==> y "+sy);
        if(this.sx>=0 & this.sx<600 && this.sy>=0 & this.sy<400){
            canvas.setRGB(this.sx, this.sy, this.color.getRGB());
        }
        
    }
    
    public void apagar(BufferedImage canvas){
        encender(canvas);
    }

    public Double getX0() {
        return x0;
    }

    public void setX0(Double x0) {
        this.x0 = x0;
    }

    public Double getY0() {
        return y0;
    }

    public void setY0(Double y0) {
        this.y0 = y0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
