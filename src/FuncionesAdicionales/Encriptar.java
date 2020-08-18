/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesAdicionales;

import Texto.Texto;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JTextPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author GadgetL
 */
public class Encriptar extends FuncionesAdicionales {
    private static String clave = "RSA";
    KeyPairGenerator keyPair = KeyPairGenerator.getInstance(clave);

    public Encriptar(Texto txt) throws NoSuchAlgorithmException {
        super(txt);
        keyPair.initialize(512);
    }

    @Override
    public void escribir(String dato, JTextPane jtxtPane) {
        txt.escribir(dato, jtxtPane);
        encriptar(dato, jtxtPane); //verificar txt 
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
        String encr;
        try {
            encr = Base64.getEncoder().encodeToString(clave.getBytes("utf-8"));
            txt.escribir(encr, jtxtPane);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Encriptar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*final Cipher rsa;
        try {
            rsa = Cipher.getInstance(clave);
            rsa.init(Cipher.ENCRYPT_MODE, keyPair.genKeyPair().getPublic());
            rsa.update(txt.leer().getBytes());
            final byte[] result = rsa.doFinal();
            String encriptado = DatatypeConverter.printHexBinary(result);
            txt.escribir(encriptado, jtxtPane);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encriptar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Encriptar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Encriptar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Encriptar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Encriptar.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }

    @Override
    public void desencriptar(String clave, JTextPane jtxtPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
