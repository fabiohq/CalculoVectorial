/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.utilidades;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author FABIO
 */
public class ConexionArduinoJava {
    
    public static int datos;
    static PanamaHitek_Arduino pa = new PanamaHitek_Arduino();
    static SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if(pa.isMessageAvailable()){
                    //System.out.println(pa.printMessage());
                    try {
                       int dato = new Integer(pa.printMessage());
                       datos = dato;
                        System.out.println(dato);
                    } catch (Exception e) {
                    }
                    
                }
                
            } catch (ArduinoException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionArduinoJava.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SerialPortException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionArduinoJava.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    public void init(){
        try {           
            pa.arduinoRX("COM8", 9600, listener);
        } catch (ArduinoException ex) {
            ex.printStackTrace();
        } catch (SerialPortException ex) {
            Logger.getLogger(ConexionArduinoJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
