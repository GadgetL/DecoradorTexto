/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesAdicionales;

import Texto.Texto;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import static java.util.Base64.getDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JTextPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author GadgetL
 */
public class Desencriptar extends FuncionesAdicionales{
    //private static String clave = "RSA";
    //KeyPairGenerator keyPair = KeyPairGenerator.getInstance(clave);
    
    public Desencriptar(Texto txt) throws NoSuchAlgorithmException {
        super(txt);
        //keyPair.initialize(512);
    }

    @Override
    public void escribir(String dato, JTextPane jtxtPane) {
        txt.escribir(dato, jtxtPane);
        desencriptar(dato, jtxtPane); //verificar txt 
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
    public void desencriptar(String clave, JTextPane jtxtPane){ 
        
            
            try {
                byte[] decode = Base64.getDecoder().decode(clave.getBytes());
                txt.escribir(new String(decode, "utf-8"), jtxtPane);            
            
            
            /*final Cipher rsa;
            try {
            System.out.println("fghjk+ " +txt.leer());
            rsa = Cipher.getInstance("RSA");
            //KeyFactory keyFactory = (KeyFactory) KeyFactory.getInstance("RSA");
            //PKCS8EncodedKeySpec ks = new PKCS8EncodedKeySpec(keyPair.genKeyPair().getPrivate()));
            //RSAPrivateKey privKey = (RSAPrivateKey) keyFactory.generatePrivate(ks);
            rsa.init(Cipher.DECRYPT_MODE, keyPair.generateKeyPair().getPrivate());
            byte[] encryptedbytes = rsa.doFinal(Base64.getDecoder().decode(txt.leer().getBytes("UTF-8")));            
            final String desencriptado = new String(encryptedbytes);
            
            txt.escribir(desencriptado, jtxtPane);
            } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Desencriptar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Desencriptar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
            Logger.getLogger(Desencriptar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Desencriptar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
            Logger.getLogger(Desencriptar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Desencriptar.class.getName()).log(Level.SEVERE, null, ex);
            }    */
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Desencriptar.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }
    
}
