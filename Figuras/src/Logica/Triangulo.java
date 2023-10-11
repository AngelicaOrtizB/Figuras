package Logica;

public class Triangulo extends Figura {
	private double lado2;
	public Triangulo(double lado1, double lado2) {
		super(lado1);
		this.lado2= lado2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.lado1+ this.lado2+ Math.sqrt(Math.pow(this.lado1, 2)+Math.pow(this.lado2, 2)) ;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.lado1*this.lado2)/2;
	}

}
