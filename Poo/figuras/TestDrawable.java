package figuras;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDrawable {

	private static ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
	
	@BeforeClass
	public static void testTamaño() {
		Cuadrado cuadradoPrueba = new Cuadrado();
		Circulo circuloPrueba = new Circulo();
		Elipse elipsePrueba = new Elipse();
		Rectangulo rectanguloPrueba = new Rectangulo();
		
		figuras = new ArrayList<>();
		
		figuras.add(cuadradoPrueba);
		figuras.add(circuloPrueba);
		figuras.add(elipsePrueba);
		figuras.add(rectanguloPrueba);
		
		
	
	}
	@Test
	public void testDraw() {

		
		Dibujar.imprimirFiguras(figuras);
		Dibujar.aplicarTema(figuras);
		
		assertEquals(4,figuras.size());
		
		//assertTrue(cuadradoPrueba instanceof Cuadrado);
		//assertTrue(cuadradoPrueba instanceof FiguraGeometrica);
		//assertTrue(cuadradoPrueba instanceof Drawable);
		

	}

	@Test
	public void testPolimorfismo() throws IOException{
		
		Drawable circulito = new Circulo("círculo", 5);
		
		assertTrue(circulito instanceof Drawable);
		assertTrue(circulito instanceof Circulo);
		
		// vista Drawable de circulito => acceso al metodo draw de la interfaz e implementado!
		
		circulito.draw();
		
		// vista Drawable de circulito => acceso al metodo applyTheme de la interfaz e implementado!
		
		circulito.applyTheme();
		
		// circulito.area(); // no compila: como circulito es de tipo Drawable, no dispone del método area()
		
		Circulo vistaCirculo;
		vistaCirculo = (Circulo) circulito;
		
		assertEquals(Math.PI * Math.pow(5, 2), vistaCirculo.area(), 0.1); 
	}
}
