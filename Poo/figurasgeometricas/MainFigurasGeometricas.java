package org.foobarspam.figurasgeometricas;

public class MainFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo primerRectangulo = new Rectangulo("primero",5,4);
		Cuadrado primerCuadrado = new Cuadrado("primero", 2);
		Circulo primerCirculo = new Circulo("primero", 5);
		Eclipse primerEclipse = new Eclipse("primer", 5, 10);
		
		if (primerRectangulo.area() == 20 && primerCuadrado.area() == 4){
			System.out.println("Rectangulo OK"+"\n"+ "Cuadrado OK");
		}else{
			System.out.println("Rectangulo KO"+"\n"+ "Cuadrado KO");
		}
		if (primerCirculo.area()==78.5 && primerEclipse.area()==157){
			System.out.println("Circulo OK"+"\n"+ "Elipse OK");
	  }else{
		  System.out.println("Circulo KO"+"\n"+ "Elipse KO");
	  }
	}
}
