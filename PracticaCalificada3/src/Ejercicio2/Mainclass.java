package Ejercicio2;

public class Mainclass {

	public static void main(String[] args) {
		
		Forma misFormas[] = new Forma[3];
		
		misFormas[0] = new Circulo(3.1415, 5, 15.7075);
		misFormas[1] = new Rectangulo(13.18, 24.56, 323.7008);
		misFormas[2] = new Cuadrado(10, 100);
		
		for(Forma forma: misFormas) {
			
			System.out.println(forma.CalcularArea());
			System.out.println(" ");
		}

	}

}
