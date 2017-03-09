package figuras;

import java.io.IOException;
import java.util.ArrayList;

public class Dibujar {
	public static void imprimirFiguras(ArrayList<FiguraGeometrica> lista){
		for (FiguraGeometrica figura : lista){
			figura.draw();
		}
	}
	
	public static void aplicarTema(ArrayList<FiguraGeometrica> lista){

			
		for (FiguraGeometrica figura : lista){
				try {
					figura.applyTheme();
				}
				catch (IOException e) {
					System.out.println("Esta figura todavía no puede aplicar temas");
				}
		}
	}
}

