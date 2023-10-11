package Logica;

public class Cuadrado extends Figura {

	public Cuadrado(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.lado1*4;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.lado1*this.lado1;
	}

}
