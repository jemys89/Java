package org.foobarspam.kata;

public enum Direction {
	
	N( 'N'),
	E('E'),
	S('S'),
	O('O');
	
	private int direction = 0;
	
	private char orientacion = 0;
	
	private Direction(){
		
	}
	private Direction( char direction){
		this.direction = direction;
		
	}
	
	
}
