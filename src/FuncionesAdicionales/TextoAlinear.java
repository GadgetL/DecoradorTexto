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
public class TextoAlinear extends FuncionesAdicionales{
    private static String tipo = "centro";
    
    public TextoAlinear(Texto txt) {
        super(txt);
    }

    @Override
    public void escribir(String dato,JTextPane jtxtPane) {
        txt.escribir(dato,jtxtPane);
        alinear(tipo);       
    }
    
    @Override
    public void alinear(String tipo) {
        StyledDocument doc = txt.getJtxtPane().getStyledDocument();
        SimpleAttributeSet alineacion = new SimpleAttributeSet();        
        switch (tipo) {
            case "centro":
                StyleConstants.setAlignment(alineacion, StyleConstants.ALIGN_CENTER);
                TextoAlinear.tipo = "derecha";
                break;
            case "derecha":
                StyleConstants.setAlignment(alineacion, StyleConstants.ALIGN_RIGHT);
                TextoAlinear.tipo = "izquierda";
                break;
            case "izquierda":
                StyleConstants.setAlignment(alineacion, StyleConstants.ALIGN_LEFT);
                TextoAlinear.tipo = "centro";
                break;
            default:
                break;
        }
        doc.setParagraphAttributes(0, doc.getLength(), alineacion, false);        
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
