package com.keypad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.keypad.data.PhoneNumber;
import com.keypad.services.PhoneNumbersService;

@RestController
public class PhoneNumbersController {
	
	@Autowired
	PhoneNumbersService phoneNumberService;
	
	@GetMapping("/")
	public String renderInitForm() {
		return String.format("Get Phone Numbers Application ", null);
	}
	
	@PostMapping("/phoneNumbers")
	public List<PhoneNumber> getTelephoneNumberCombinations(@RequestBody PhoneNumber inputObject) {
		
		System.out.println("Phone number from UI : "+ inputObject.getPhoneNumber());				
		return phoneNumberService.getPossibleCombinations(inputObject.getPhoneNumber());
	}
	
}

