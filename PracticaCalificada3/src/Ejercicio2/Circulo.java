package Ejercicio2;

public class Circulo extends Forma {

	private double pi;
	private double radio;

	public Circulo(double area, double pi, double radio) {
		super(area);
		this.pi = pi;
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String CalcularArea() {
		return "El area del circulo es : "+pi*(radio*radio);
	}

}
