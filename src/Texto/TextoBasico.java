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
public class TextoBasico extends Texto{

    @Override
    public String leer() {
        return dato;
    }

    @Override
    public void escribir(String dato, JTextPane jtxtPane) {
        this.dato = dato;
        setJtxtPane(jtxtPane);
        System.out.println("textbas " + dato);
        getJtxtPane().setText(dato);
    }

    @Override
    public void alinear(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void justificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void encriptar(String clave, JTextPane jtxtPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desencriptar(String clave, JTextPane jtxtPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }       
}
