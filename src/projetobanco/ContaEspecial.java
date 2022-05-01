package projetobanco;

public class ContaEspecial extends ContaBanco {
	public int numConta;
	protected String tipo;
	private String titular;
	private float saldo;
	private boolean status;
	private String cpf;

	
	public void estadoAtualEsp() {
		super.setStatus(true);
		super.estadoAtual();
		super.setCpf(cpf);
		
	
	}
	
	public void abrirContaEsp() {
		
		this.setStatus(true);
		
		System.out.println("* Seja Bem-vindo ao BLUE BANK INVEST *");
		System.out.println("Conta aberta com sucesso!");
		
	}
	
	

	 public void depositar() {
		super.depositar(getSaldo());
	}


}
