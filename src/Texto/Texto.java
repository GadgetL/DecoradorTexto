/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Texto;

import javax.swing.JTextPane;

/**
 *
 * @author GadgetL
 */
public abstract class Texto{
    protected String dato;
    protected JTextPane jtxtPane;
    
    public abstract String leer(); //retorna (lee) el valor del dato
    public abstract void escribir(String dato, JTextPane jtxtPane); //escribir el valor del dato

    public JTextPane getJtxtPane() {
        return jtxtPane;
    }

    public void setJtxtPane(JTextPane jtxtPane) {
        this.jtxtPane = jtxtPane;
    }
    
    public abstract void alinear( String tipo);
    public abstract void justificar();
    public abstract void encriptar(String clave, JTextPane jtxtPane);
    public abstract void desencriptar(String clave, JTextPane jtxtPane);
}
