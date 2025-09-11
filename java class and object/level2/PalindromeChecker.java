package com.bridgelabz.oops.levelone;

public class PalindromeChecker {
		    String text;
		    public boolean isPalindrome() {
		        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
		        String reversed = new StringBuilder(cleanedText).reverse().toString();
		        return cleanedText.equals(reversed);
		    }
		    public void displayResult() {
		        System.out.println("Text: " + text);
		        if (isPalindrome()) {
		            System.out.println("Result: It is a palindrome.");
		        } else {
		            System.out.println("Result: It is not a palindrome.");
		        }
		    }
		    public static void main(String[] args) {
		        PalindromeChecker checker = new PalindromeChecker();
		        checker.text = "Madam";  
		        checker.displayResult();
		    }
		}
