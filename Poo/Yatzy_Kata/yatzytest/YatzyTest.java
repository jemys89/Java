package org.foobarspam.yatzytest;

import static org.junit.Assert.*;

import org.junit.Test;

import org.foobarspam.yatzy.Yatzy;

public class YatzyTest {

	@Test
	public void test_chance() {
        assertEquals(15, Yatzy.chance(1 ,2, 3, 4, 5));
        assertEquals(14, Yatzy.chance(1, 1, 3, 3, 6));

}

	 @Test 
	    public void test_yaty() {
	        assertEquals(50, Yatzy.yatzy(1, 1, 1, 1, 1));
	        assertEquals(0, Yatzy.yatzy(1, 1, 1, 2, 1));
	    }
	 @Test
	 public void test_ones(){
		 assertEquals(0,Yatzy.ones(3, 3, 3, 4, 5));
		 assertEquals(5,Yatzy.ones(1, 1, 1, 1, 1));
		 }
	 @Test
	 public void test_twos(){
		 assertEquals(0,Yatzy.twos(3, 3, 3, 4, 5));
		 assertEquals(4,Yatzy.twos(2, 3, 2, 5, 1));
		 }
	 @Test
	 public void test_three(){
		 assertEquals(0,Yatzy.three(1, 1, 1, 1, 1));
		 assertEquals(9,Yatzy.three(3, 3, 3, 4, 5));
		 }
	 @Test
	 public void test_four(){
		 assertEquals(8,Yatzy.four(4, 5, 6, 4, 5));
		 
		 }
	 @Test
	 public void test_five(){
		 assertEquals(10,Yatzy.five(4, 5, 6, 4, 5));
	 }
	 @Test
	 public void test_six(){
		 assertEquals(6,Yatzy.six(4, 5, 6, 4, 5));
	 }
	 @Test
	 public void test_pair(){
		 assertEquals(8,Yatzy.pair(3, 3, 3, 4, 4));
		 assertEquals(12,Yatzy.pair(1, 1, 6, 2, 6));
		 assertEquals(6,Yatzy.pair(3, 3, 3, 4, 1));
		 assertEquals(6,Yatzy.pair(3, 3, 3, 3, 1));
		 assertEquals(0,Yatzy.pair(1, 2, 3, 4, 5));
	 }
	 @Test
	 public void test_two_pair(){
		 assertEquals(8,Yatzy.two_pair(1, 1, 2, 3, 3));
		 assertEquals(0,Yatzy.two_pair(1, 1, 2, 3, 4));
		 assertEquals(6,Yatzy.two_pair(1, 1, 2, 2, 2));
		 assertEquals(0,Yatzy.two_pair(1, 2, 3, 4, 5));
		 
	 }	 
}