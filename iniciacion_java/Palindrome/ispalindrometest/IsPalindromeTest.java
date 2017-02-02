package org.foobarspam.ispalindrometest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.ispalindrome.*;
public class IsPalindromeTest {

	@Test
	public void test_palindrome() {
		
		
		assertEquals(Palindrome.isPalindrome("noon"),true);
		assertEquals(Palindrome.isPalindrome("bob"),true);
		assertEquals(Palindrome.isPalindrome("non stop"),false);
		assertEquals(Palindrome.isPalindrome("hello"),false);
		assertEquals(Palindrome.isPalindrome("1542"),false);
		assertEquals(Palindrome.isPalindrome("1111"),true);
	}

	
}
