package com.zzx.test;

import java.security.Provider;
import java.security.Security;
import java.util.Map;

public class providertest {
	public static void main(String[] args) {
		for(Provider p: Security.getProviders()){
			System.out.println(p);
		
			for(Map.Entry<Object, Object> entry : p.entrySet()){
				System.out.println("\t"+entry.getKey());
			}
		}
	}
}
