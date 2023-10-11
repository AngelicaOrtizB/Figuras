package Presentación;

import Logica.Figura;
import Logica.Triangulo;
import Logica.Cuadrado;
import Logica.Circulo;
import Logica.Cuerpo;
import Logica.Cubo;
import Logica.Esfera;

public class Principal {
	
	public Principal() {
		double lado1= 2;
		double lado2= 3;
		Figura f;
		f=new Circulo(lado1);
		System.out.println(f.perimetro());
		System.out.println(f.area());
		f=new Cuadrado(lado1);
		System.out.println(f.perimetro());
		System.out.println(f.area());
		f= new Triangulo(lado1, lado2);
		System.out.println(f.perimetro());
		System.out.println(f.area());
		Cuerpo c;
		c= new Cubo(lado1);
		System.out.println(c.calcularVolumen());
		c= new Esfera(lado1);
		System.out.println(c.calcularVolumen());
		
		 
	}

	public static void main(String[] args) {
		new Principal();
	}
}
