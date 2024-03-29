/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.principal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author FABIO
 */
public class AreaDibujo extends javax.swing.JPanel {

    /**
     * Creates new form AreaDibujo
     */
    public AreaDibujo() {
        canvas = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    BufferedImage canvas;//Subclase que ereda de la claase 
    //Método encargado de dibujar en nuestra area de trabajo a traves de lo que traiga el caambas
    public void pintar(BufferedImage canvas){
        Graphics g = this.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(canvas, null, null);
    }
    /**
     * 
     * @param i posicion en el eje x
     * @param j posicion en el eje y
     * @param color el color que se va a pintar
     * @param canvas y el maapa de bits
     */
    public void pintarPixelCanvas(int i, int j, Color color,BufferedImage canvas){
        canvas.setRGB(i, j, color.getRGB());
    }
    //metodo que borra el mapa de bits
    public void limpiar(){
        Graphics g = this.getGraphics();
        System.err.println("==> Width "+this.getWidth());
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                pintarPixelCanvas(i, j, this.getBackground(), canvas);
            }
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(canvas, null, null);
    }

    public BufferedImage getCanvas() {
        return canvas;
    }

    public void setCanvas(BufferedImage canvas) {
        this.canvas = canvas;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
