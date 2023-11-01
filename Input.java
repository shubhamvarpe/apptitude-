package com.java;

public class Input {


	    public static boolean isPangram(String input) {
	       
	        boolean[] alphabet = new boolean[26];
	        
	      
	        input = input.toLowerCase();
	        
	        
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                alphabet[c - 'a'] = true;
	            }
	        }
	        
	    
	        for (boolean letterPresent : alphabet) {
	            if (!letterPresent) {
	                return false; // At least one letter is missing
	            }
	        }
	        
	        return true; // All letters are present
	    }

	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog";
	        boolean isPangram = isPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    
	


	}

}
