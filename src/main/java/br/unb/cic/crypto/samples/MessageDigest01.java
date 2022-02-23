package br.unb.cic.crypto.samples;

import java.security.MessageDigest;

public abstract class MessageDigest01 {
	
	public void savePassword(String password) throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(password.getBytes());
		byte[] digest = md.digest();
		save(digest);
	}
	
	public abstract String getAlgorithm(); 
	
	private void save(byte[] digest) {
		// DO NOTHING.
	}

}
