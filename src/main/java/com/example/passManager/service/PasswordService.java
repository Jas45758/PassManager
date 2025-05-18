package com.example.passManager.service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.example.passManager.model.Credential;
import com.example.passManager.util.CryptoUtil;

@Service
public class PasswordService {

	private final Map<String, Credential> credentialStore = new HashMap<>();
	public void saveCredential(String username, String service, String password) {
		String encrypted = CryptoUtil.encrypt(password);
		Credential cred = new Credential(username,service, encrypted);
		credentialStore.put(username+":"+service,cred);
	}
	public String getPassword(String username, String service) {
		Credential cred = credentialStore.get(username+":"+service);
		if(cred != null) {
			return CryptoUtil.decrypt(cred.getEncryptedPassword());
		}
		return null;
	}
	public List<Credential> getAllCredential(){
		return new ArrayList<>(credentialStore.values());
	}
}
