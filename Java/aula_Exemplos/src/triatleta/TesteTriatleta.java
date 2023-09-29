package triatleta;

public class TesteTriatleta {

	public static void main(String[] args) {
		
		Triatleta t1 = new Triatleta("Rapha");
		
		t1.aquecer();
		t1.correr();
		t1.pedalar();
		t1.nadar();
		t1.cansou();
	}

}
