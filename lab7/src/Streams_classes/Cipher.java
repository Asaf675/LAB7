package Streams_classes;

import java.util.HashMap;
import java.util.Random;

public class Cipher {
	
	private static Cipher cipher = null;
	HashMap <Character,Character> code;
	HashMap <Character,Character> decode;
	
	private Cipher() {
		code = new HashMap<Character,Character>();
		decode = new HashMap<Character,Character>();
		String a = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=- ");
		char[] chars = new char[a.length()];
		
		for(int i = 0; i < a.length(); i++)
			chars[i] = a.charAt(i);
		
		Random rand = new Random();
		int j;
		char temp;
		for(int i = 0; i < a.length(); i++) {
			j = rand.nextInt(a.length());
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		
		for(int i = 0; i < a.length(); i++) {
			code.put(a.charAt(i), chars[i]);
			decode.put(chars[i], a.charAt(i));
		}
	}
	
	public static Cipher getCipher() {
		
		if( cipher == null) 
		cipher = new Cipher();
		
		return cipher;
	}

public String encode(String s) {
	StringBuilder sb = new StringBuilder();
	
	for(char c : s.toCharArray()) {
		if(code.get(c) != null)
			sb.append(code.get(c));
		else
			sb.append(c);
	}
	return sb.toString();
}

public String decode(String s) {
	StringBuilder sb = new StringBuilder();
	
	for(char c : s.toCharArray()) {
		if(decode.get(c) != null)
			sb.append(decode.get(c));
		else
			sb.append(c);
	}
	return sb.toString();
}

}
