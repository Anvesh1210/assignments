package com.assignment2.question2;

import java.util.regex.Pattern;

public class RegexValidator {

	// Validate Mobile Number
	public boolean validateMobile(String mobile) {
		return Pattern.matches("[6-9][0-9]{9}", mobile);
	}

	// Validate Email ID
	public boolean validateEmail(String email) {
		return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
	}

	// Validate Username
	public boolean validateUsername(String username) {
		return Pattern.matches("[A-Za-z0-9_]{5,15}", username);
	}

	// Validate Password
	public boolean validatePassword(String password) {
		return Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}", password);
	}
}
