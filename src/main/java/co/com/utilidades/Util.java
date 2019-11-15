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
public class Util {
   
    /**
     * 
       @param x pocicion variable color inicial inicia en cero enviaado por iteracion
     * @param x1 valor determinado pocicion cero inicio del recuadro
     * @param y1 Color final 
     * @param x2 hasta valor determinado Pocicion final fijo del recuadro 200 pixeles donde debe ser distinto de x1
     * @param y2 color final de la interpolacion
     * @return 
     */
    public static double interpolarDosPuntos(double x, double x1,double y1,double x2,double y2){
        return ((y1 * ((x - x2) / (x1 - x2))) + (y2 * ((x - x1) / (x2 - x1))));
    }
}
