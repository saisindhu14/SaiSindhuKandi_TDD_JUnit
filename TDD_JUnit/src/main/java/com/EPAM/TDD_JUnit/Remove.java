package com.EPAM.TDD_JUnit;

public class Remove {
	public String remove(String string) {
		String n = string;
		if(string.length() >= 1 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')) {
			n = string.substring(1);
		}
		if(string.length() >= 2 && (string.charAt(0) != 'A'|| string.charAt(0) != 'a') && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			n = string.charAt(0) + string.substring(2);
		}
		if(string.length() >= 2 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')  && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			n = string.substring(2);
		}
		return n; 
	}
}
