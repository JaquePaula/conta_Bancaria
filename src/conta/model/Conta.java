package conta.model;

public class Conta {
	// criacao dos atributos da classe conta. São private para implementar o encapsulameto(métodos get e set)
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
 // contrutor com mesmo nome da classe gerado por meio do: source > generate contructor using fields
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;    // this.numero é o atributo da classe e o numero apos igual é o parametro do metodo construtor, o argumento
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
// criando get e set: source > generate getters and setters. Atributo será retornado através do return 
	public int getNumero() {
		return numero;
	}
// o set é assinado com void, pois o valor sera alterado e nao vai retornar valor. Ele sera o valor atraves do .this
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
// criando metodos especificos da classe conta: Sacar
	public boolean sacar(float valor) {

		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	// criando metodos especificos da classe conta: depositar
	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);

	}
// Método visualizar definido como void(ele não precisa retornar uma confirmação, e sim exibir os dados de um Objeto conta)
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);

	}

}
