package Logica;

public abstract class Figura {
	protected double lado1;

	public Figura(double lado1) {
		super();
		this.lado1 = lado1;
	}
	public abstract double perimetro ();
	public abstract double area();
	
}
	


