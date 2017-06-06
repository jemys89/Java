package org.foobarspam.kata;

public class KataMarsRovers {

	Mapa mapa = new Mapa();
	private int x, y = 0;

	private Direction direction;

	public KataMarsRovers() {

	}

	public KataMarsRovers(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setDirection(Direction value) {

		this.direction = value;

	}

	public Direction getDirection() {
		return this.direction;
	}

	public boolean comprobarObstaculosX() {
		if(getX() < 9){
		if (mapa.getMapa()[this.getX() + 1][this.getY()] == 'A') {
			return true;
		} else {
			return false;
		}}else{
			if (mapa.getMapa()[0][getY()] == 'A') {
				return true;
			} else {
				return false;
			}
		}
		
	}

	public boolean comprobarObstaculosY() {
		if(getY() < 9){
		if (mapa.getMapa()[this.getX()][this.getY() + 1] == 'A') {
			return true;
		} else {
			return false;
		}
		}else{
			if (mapa.getMapa()[getX()][0] == 'A') {
				return true;
			} else {
				return false;
			}
		}
	}

	public void moverHaciaDelante(char mover) {

		switch (mover) {

		case 'F':
			// if(comprobarObstaculosX()){
			// this.x += 1;
			// }else{
			// System.out.println("Hay un obstáculo");

			// }
			if (comprobarObstaculosX() ||comprobarLimiteX()) {
				if (getDirection() == Direction.E) {
					if(( getX() == 9) && comprobarLimiteX()){	
					
					this.x = 0;
					}else{
						setX(getX()+1);
					}

				} else if (getDirection() == Direction.O) {
					if(( getX() == 0) && comprobarLimiteX()){
					setX(9);
					}else{
						setX(getX()-1);
					}
				}
			}
			if (comprobarObstaculosY() || comprobarLimiteY()) {

				if (getDirection() == Direction.N) {
					if(( getY() == 9) && comprobarLimiteY()){	
						
						setY(0);
						}else{
							setY(getY()+1);
						}

				} else if (getDirection() == Direction.S) {
					if(( getY() == 0) && comprobarLimiteY()){	
						
						setY(9);
						}else{
							setY(getY()-1);
						}
				}
			}
				break;
				
			case 'B':
				if (comprobarObstaculosX() || comprobarLimiteX()) {
					if (getDirection() == Direction.E) {
						if( getX() == 0 && comprobarLimiteX()){	
							
							setX(9);
							}else{
								setX(getX()-1);
							}

					} else if (getDirection() == Direction.O) {
						if(( getX() == 9) && comprobarLimiteX()){	
							
							setX(0);
							}else{
								setX(getX()+1);
							}
					}
				}
				if (comprobarObstaculosY() || comprobarLimiteY()) {

					if (getDirection() == Direction.N) {
						if(( getY() == 0) && comprobarLimiteY()){	
							
							setY(9);
							}else{
								setY(getY()-1);
							}

					} else if (getDirection() == Direction.S) {
						if(( getY() == 9) && comprobarLimiteY()){	
							
							setY(0);
							}else{
								setY(getY()+1);
							}
					}
					break;
					
				

			}

		}
		

	}
	
	public boolean comprobarLimiteX(){
		if((getX() == 9 && mapa.getMapa()[0][getY()] == 'A') || (getX() == 0 && mapa.getMapa()[9][getY()] == 'A') ){
			
			return true;
		}else{
			return false;
		}
		
	}
	public boolean comprobarLimiteY(){
		if((getY() == 9 && mapa.getMapa()[getX()][0] == 'A') || (getY() == 9 && mapa.getMapa()[getX()][9] == 'A') ){
			return true;
		}else{
			return false;
		}
		
	}

	public void moverHaciaUnLado(char giro) {

		switch (giro) {
		case 'I':
			if (getDirection() == Direction.E) {
				setDirection(Direction.N);

			} else if (getDirection() == Direction.N) {
				setDirection(Direction.O);
			} else if (getDirection() == Direction.O) {
				setDirection(Direction.S);
			} else if (getDirection() == Direction.S) {
				setDirection(Direction.E);
			}
			break;

		case 'D':
			if (getDirection() == Direction.E) {
				setDirection(Direction.S);
			} else if (getDirection() == Direction.S) {
				setDirection(Direction.O);
			} else if (getDirection() == Direction.O) {
				setDirection(Direction.N);
			} else if (getDirection() == Direction.N) {
				setDirection(Direction.E);
			}
			break;
		}

	}

}
