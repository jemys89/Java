package org.foobarspam.kata;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Mapa {
	
	private char mapa[][] = new char[10][10];
	
	public Mapa(){
		
		this.mapa = mapa;
		
	}
	
	public void rellenarMapa(){
		
		for(int i = 0; i< 10; i++){
			for(int j = 0;j < 10; j++){
				mapa[i][j] = 'A';
			}
		}
	}
	public void rellenarMapaConObstaculos(int obstaculos){
		
		Random random = new Random();
		while(obstaculos > 0){
			
		
		for(int i = 0; i< 10;i++){
			for(int j = 0; j< 10;j++){
				int randomNumero = random.nextInt((10 - 1) + 1) + 0;
				this.mapa[randomNumero][randomNumero] = 'X';
				obstaculos -=1;
			}
		}
	}}
	
	public char[][] getMapa(){
		return this.mapa;
	}

}
