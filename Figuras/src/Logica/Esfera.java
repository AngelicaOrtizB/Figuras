package Logica;

public class Esfera extends Circulo implements Cuerpo{

	public Esfera(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularVolumen() {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*Math.pow(this.lado1, 3);
	}

}
