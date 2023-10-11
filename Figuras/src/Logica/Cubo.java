package Logica;

public class Cubo extends Cuadrado implements Cuerpo{

	public Cubo(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularVolumen() {
		// TODO Auto-generated method stub
		return Math.pow(lado1, 3);
	}

}
