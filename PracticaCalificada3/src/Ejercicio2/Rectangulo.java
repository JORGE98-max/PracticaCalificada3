package Ejercicio2;

public class Rectangulo extends Forma {

	private double base;
	private double altura;

	public Rectangulo(double area, double base, double altura) {
		super(area);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String CalcularArea() {
		return "El area es : " + base * altura;
	}
}
