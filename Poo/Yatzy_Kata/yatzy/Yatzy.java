package org.foobarspam.yatzy;

import java.util.Arrays;

public class Yatzy {
		
	protected int [] dice;
	
	public Yatzy(int d1, int d2, int d3, int d4, int d5){
		
		this.dice = new int[] {d1, d2, d3, d4, d5};
	}
	
	
	
	public static int chance(int... dice){
		int score = 0;
		for (int die : dice){
			score+= die;
		}
		return score;
	}

	public static int yatzy(int... dice){
		int score = 0;
		for (int i : dice){   
			if(i != dice[0]){
				return 0;
			}
		}
			return 50;
		
		
	}
	public static int ones(int... dice){
		int ONE = 1;
		int score = 0;
		for (int die : dice){
			if(die == ONE){
				score += die;
			}
		}return score;
	}
	public static int twos(int... dice){
		int TWO = 2;
		int score = 0;
		for (int die : dice){
			if(die == TWO){
				score += die;
			}
		}return score;
	}
	public static int three(int...dice ){
		int THREE= 3;
		int score = 0;
		for (int die : dice){
			if(die == THREE){
				score += die;
			}
		}return score;
	}
	public static int four(int...dice ){
		int FOUR= 4;
		int score = 0;
		for (int die : dice){
			if(die == FOUR){
				score += die;
			}
		}return score;
	}
	public static int five(int...dice ){
		int FIVE= 5;
		int score = 0;
		for (int die : dice){
			if(die == FIVE){
				score += die;
			}
		}return score;
	}
	public static int six(int...dice ){
		int SIX= 6;
		int score = 0;
		for (int die : dice){
			if(die == SIX){
				score += die;
			}
		}return score;
	}
	public static int pair(int...dice){
		int TWO = 2;
		int score = 0;
		Arrays.sort(dice);
		for (int i = dice.length - 1; i > 0;i-- ){
			if(dice[i] == dice[i-1]){
				return score = dice[i] * TWO;
			}
		}return score;
	}
	public static int two_pair(int...dice){
		int TWO = 2;
		int pairs = 0;
		int score = 0;
		Arrays.sort(dice);
		
	}
}
