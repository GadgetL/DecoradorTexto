/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesAdicionales;

import Texto.Texto;
import Texto.TextoBasico;
import javax.swing.JTextPane;


/**
 *
 * @author GadgetL
 */
public abstract class FuncionesAdicionales extends Texto {
    protected Texto txt;

    public FuncionesAdicionales(Texto txt){
        this.txt = txt;
    }
    
    @Override
    public String leer() {
        return txt.leer();
    }
    @Override
    public void escribir(String dato,JTextPane jtxtPane) {
        //System.out.println("d " + dato);
        txt.escribir(dato,jtxtPane);
    }
}
