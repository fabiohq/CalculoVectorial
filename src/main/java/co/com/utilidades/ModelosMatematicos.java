/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.utilidades;

/**
 *
 * @author FABIO
 */
public class ModelosMatematicos {
    protected final int sx1 =0;
    protected final int sy1 =0;
    
    protected final int sx2 =600;
    protected final int sy2 =400;
    
    protected double x1 =-15;
    protected double y1 =-10;
    
    protected double x2 =15;
    protected double y2 =10;
    
    protected int sx;
    protected int sy;
    
    protected double x;
    protected double y;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public int getSy() {
        return sy;
    }

    public void setSy(int sy) {
        this.sy = sy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //Recibe dos valores reales
    //dos puntos del plano cartesiaano y se convierten aa pixeles para poder pintar en pantallaa
    public void pantalla(double x, double y){
        this.sx = (int) ((((sx2 - sx1) / (x2 - x1))* (x - x2) + sx2));
        this.sy = (int) ((((sy1 - sy2) / (y2 - y1)) * (y - y2) + sy1));
    }
    
    //recibe pixeles y transforma a reales
    public void pantalla(int sx, int sy){
        this.x = ((((double) (sx - sx2) * (x2 - x1)) / (double) (sx2 - sy1)) + x2);
        this.y = ((((double) (sy - sy1) * (y2 - y1)) / (double) (sy1 - sy2)) + y2);
    }
    
}
