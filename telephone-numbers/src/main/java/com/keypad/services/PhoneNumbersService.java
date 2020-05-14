package com.keypad.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.keypad.data.PhoneNumber;

@Service
public class PhoneNumbersService {
	
	final static HashMap<Character, String> KEYPAD = new HashMap<>();
	
	static {
		KEYPAD.put('2', "abc");
		KEYPAD.put('3', "def");
		KEYPAD.put('4', "ghi");
		KEYPAD.put('5', "jkl");
		KEYPAD.put('6', "mno");
		KEYPAD.put('7', "pqrs");
	    KEYPAD.put('8', "tuv");
	    KEYPAD.put('9', "wxyz");
	    KEYPAD.put('0', "0");
	    KEYPAD.put('1', "0");
	}
	
	
	public List<PhoneNumber> getPossibleCombinations(String phoneNumber) {
		
		List<PhoneNumber> possibleNumberList = new ArrayList<PhoneNumber>();
		if (phoneNumber == null || phoneNumber.length() == 0) {
    			return null;
		}
		
		// loop through the phone number by each character.
		for (int number = 0; number < phoneNumber.length(); number++) {
			char value = phoneNumber.charAt(number); 
			
			// Since 0 has no alphanumberic so do not show combination since it will be redundant.
			String option = KEYPAD.get(phoneNumber.charAt(number));
	    		if (option != "0") {
		    		// replace the occurrences of each number by all possible alphabets  
		    		for (int alpha = 0; 
		    			 alpha < option.length(); 
		    			 alpha++
		    		) {
		    			//System.out.print(phoneNumber.replace(value, option.charAt(alpha)));
		    			//possibleNumberList.add(phoneNumber.replace(value, option.charAt(alpha)));
		    			possibleNumberList.add(new PhoneNumber(phoneNumber.replace(value, option.charAt(alpha))));
		    		}
	    		}		    		
		}
		
		return possibleNumberList;
		
	}
	
	
	
	
	
	
	

}
