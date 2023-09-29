package ExemploPoo;

public class gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int idade;
	private String nome;
	private String raca;
	private float peso;
	
	public void Miar() {
		System.out.println("Miau");
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void Imprimir() {
		System.out.println("nome: " + this.nome);
		System.out.println("raça: " + this.raca);
		System.out.println("idade: " + this.idade + " anos");
		System.out.println("peso: " + this.peso + "Kg");
	}
}
