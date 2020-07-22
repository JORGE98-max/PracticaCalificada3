package Ejercicio2;

public class Cuadrado extends Forma {

	private double lado;

	public Cuadrado(double area, double lado) {
		super(area);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String CalcularArea() {
		return "El area del cuadrado es : " + (lado * lado);
	}

}
