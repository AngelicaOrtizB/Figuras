package Logica;

public class Circulo extends Figura{

	public Circulo(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI*this.lado1;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.lado1, 2);
	}

}
