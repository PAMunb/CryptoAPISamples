package br.unb.cic.crypto.samples;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;


public class Cipher01 {
	
	public byte[] runCipher(String plain) throws Exception {
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		SecureRandom random = SecureRandom.getInstanceStrong();
		
		keyGen.init(128, random);
		
		Key key = keyGen.generateKey();
		
		Cipher c = Cipher.getInstance("AES/CBC/Pkcs5Padding"); 
		
		c.init(Cipher.ENCRYPT_MODE, key);
		return c.doFinal(plain.getBytes());
	}
	
//	public Cipher createCipher() {
//		try {
//			return Cipher.getInstance("AES/CBC/Pkcs5Padding");
//		}
//		catch(Exception e) {
//			return null;
//		}
//	}

}
