package com.keypad.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneCombinations {

	public static void main(String[] args) {
		
		final String READ = "BACK"; // FRONT
		// TODO Auto-generated method stub
		String phoneDigits = "233";
		HashMap<Character, String> keypad = new HashMap<>();
		keypad.put('2', "abc");
		keypad.put('3', "def");
		keypad.put('4', "ghi");
		keypad.put('5', "jkl");
	    keypad.put('6', "mno");
	    keypad.put('7', "pqrs");
	    keypad.put('8', "tuv");
	    keypad.put('9', "wxyz");
	    keypad.put('0', "0");
	    
	    //List<String> l = new ArrayList<>();
	    if (phoneDigits == null || phoneDigits.length() == 0) {
	    		System.out.println("No input number found. ");
	    }
	    
	    //keypad.forEach((key, value) -> { System.out.println(key + " " +value); });
	    char[] tempArray = {};
	    List<String> tempList = new ArrayList<String>(); 
	    char[] phoneNumarry = phoneDigits.toCharArray();
	    
	    for (int i = 0; i < phoneNumarry.length; i++) {
	    		System.out.print(phoneNumarry[i]);
	    }
	    
	    for (int number = 0; number < phoneNumarry.length; number++) {
	    		char value = phoneDigits.charAt(number);
	    		String option = keypad.get(phoneDigits.charAt(number));
	    		System.out.println(option);
	    }
	    
	    
//	    for (int number = 0; number < phoneDigits.length(); number++) {
//	    		char value = phoneDigits.charAt(number);
//	    		System.out.println("value"+phoneDigits.indexOf(value));
//	    		String option = keypad.get(phoneDigits.charAt(number));
//	    		
//	    		for (int alpha = 0; alpha < option.length(); alpha++) {
//	    			StringBuilder finalString = new StringBuilder("").append(option.charAt(alpha));
//	    			for (int subNumber = 0; subNumber < phoneDigits.length(); subNumber++) {
//	    				
//	    				finalString.append(phoneDigits.charAt(subNumber));
//	    			}
//	    			tempList.add(finalString.toString());
//	    			System.out.print("Possible: "+tempList);
//	    			System.out.println("");
//	    		}
//	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    for (int number = 0; number < phoneDigits.length(); number++) {
//	    		char value = phoneDigits.charAt(number);
//	    		System.out.println("Char At: "+value);
//	    		if (value != '0') {
//		    		String option = keypad.get(phoneDigits.charAt(number));
//		    		
//		    		for (int alpha = 0; alpha < option.length(); alpha++) {
//		    			StringBuilder finalString = new StringBuilder("").append(option.charAt(alpha));
//		    			for (int subNumber = number; subNumber < phoneDigits.length(); subNumber++) {
//		    				finalString.append(phoneDigits.charAt(subNumber));
//		    			}
//		    			//System.out.print(phoneDigits.replace(value, option.charAt(alpha)));
//		    			tempList.add(finalString.toString());
//		    			
//		    			System.out.print("Possible: "+tempList);
//		    			System.out.println("");
//		    		} 
//	    		}		
//	    }
	    
	    
	    

	}
	
	

}
