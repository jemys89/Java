package figuras;


public class Circulo extends FiguraGeometrica {
	
	private double radio = 0d;
	// el valor de la propiedad PI no puede variar => final
	private final double PI = Math.PI;
	
	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public Circulo(){
		super();
	}
	
	public Circulo(double radio){
		super();
		this.radio = radio;
	}
	
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}
	public void draw(){
		System.out.println("El Circulo ha sido dibujados");
	}
	
	public void applyTheme(){
		System.out.println("Se ha aplicado un tema chulo al circulo");
	}
	@Override
	public double area() {
		// math.pow(numero, potencia) = elevar un número a una potencia
		return PI * Math.pow(this.radio, 2);
	}

}
