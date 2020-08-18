/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesAdicionales;

import Texto.Texto;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author GadgetL
 */
public class TextoJustificar extends FuncionesAdicionales{

    public TextoJustificar(Texto txt) {
        super(txt);
    }

    @Override
    public void escribir(String dato,JTextPane jtxtPane) {
        txt.escribir(dato, jtxtPane);
        justificar();
    }
    
    @Override
    public void alinear(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void justificar() {
       StyledDocument doc = txt.getJtxtPane().getStyledDocument(); 
       SimpleAttributeSet justificado = new SimpleAttributeSet(); 
       StyleConstants.setAlignment(justificado, StyleConstants.ALIGN_CENTER); 
       doc.setParagraphAttributes(0, doc.getLength(), justificado, false); 
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
