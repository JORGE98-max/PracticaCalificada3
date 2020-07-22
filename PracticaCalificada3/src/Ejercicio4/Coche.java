package Ejercicio4;

public class Coche implements IVolante, IPito {
	
	@Override
	public String girar() {
		return "Gira el volante";
		
	}
	@Override
	public String pitar() {
		return "Pita el coche";
		
	}
	

}
