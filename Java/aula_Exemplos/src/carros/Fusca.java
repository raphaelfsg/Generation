package carros;

public class Fusca extends TiposDeCarros {

	@Override
	public void acelerar() {
		System.out.println("Acelerando a 80km/h");
	}
	
	public void frear() {
		System.out.println("Parando!");
	}
}
