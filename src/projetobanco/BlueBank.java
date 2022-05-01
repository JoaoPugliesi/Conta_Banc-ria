package projetobanco;

import java.util.Scanner;

public class BlueBank {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ContaBanco conta1 = new ContaBanco();
		ContaEspecial conta2 = new ContaEspecial();
		int valor, num;
		String nome, cpf;
		float deposito;

		do {
			System.out.println("************ Blue Bank ************");
			System.out.println("=====================================");
			System.out.println("|1| - Abrir Conta Corrente.");
			System.out.println("|2| - Abrir Poupança.");
			System.out.println("|3| - Depositar.");
			System.out.println("|4| - Sacar.");
			System.out.println("|5| - Pagar Taxa Adm.");
			System.out.println("|6| - PIX.");
			System.out.println("|7| - Fechar Conta.");
			System.out.println("|8| - Abrir Conta Especial.");
			System.out.println("|0| - Sair");
			System.out.println("=====================================");
			valor = input.nextInt();

			switch (valor) {

			case 1:
				System.out.println("========== Cadastro da Conta ==========");
				System.out.println("Nome completo: ");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("Informe seu CPF: ");
				cpf = input.nextLine();
				int nConta = (int) (1000 + Math.random() * (2000));
				System.out.println("Número da conta: " + nConta);
				conta1.setSaldo(50);
				System.out.printf("Saldo bônus no valor de R$%.2f \n", conta1.getSaldo());
				System.out.println("Deseja realizar um depósito - |1-SIM| |2-NÃO|: ");
				deposito = input.nextInt();
				if (deposito == 1) {
					System.out.println("Informe o valor para depósito: ");
					float dep = input.nextFloat();
					conta1.setSaldo(conta1.getSaldo() + dep);
				}
				conta1.abrirConta(null);
				conta1.setTipo("Conta Corrente");
				conta1.setTitular(nome);
				conta1.setCpf(cpf);
				conta1.setNumConta(nConta);
				conta1.setStatus(true);
				conta1.estadoAtual();
				break;

			case 2:
				System.out.println("========== Cadastro da Conta ==========");
				System.out.println("Nome completo: ");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("Informe seu CPF: ");
				cpf = input.nextLine();
				nConta = (int) (1000 + Math.random() * (2000));
				System.out.println("Número da conta: " + nConta + "-1");
				conta1.setSaldo(150);
				System.out.printf("Saldo bônus no valor de R$%.2f \n", conta1.getSaldo());
				System.out.println("Deseja realizar um depósito - |1-SIM| |2-NÃO|: ");
				deposito = input.nextInt();
				if (deposito == 1) {
					System.out.println("Informe o valor para depósito: ");
					float dep = input.nextFloat();
					conta1.setSaldo(conta1.getSaldo() + dep);
				}
				conta1.abrirConta(null);
				conta1.setTitular(nome);
				conta1.setCpf(cpf);
				conta1.setTipo("Poupança");
				conta1.setNumConta(nConta);
				conta1.setStatus(true);
				conta1.estadoAtual();
				break;

			case 3:
				System.out.println("Digite o valor do depósito: ");
				float dep = input.nextFloat();
				conta1.depositar(dep);

				conta1.estadoAtual();
				break;

			case 4:
				System.out.println("Valor do saque: ");
				float saq = input.nextFloat();
				conta1.sacar(saq);
				conta1.estadoAtual();
				break;

			case 5:
				conta1.pagarMensal();
				conta1.estadoAtual();
				break;

			case 6:
				System.out.println("Informe o tipo da chave: ");
				System.out.println("|1| - CPF/CNPJ");
				System.out.println("|2| - Celular");
				System.out.println("|3| - E-mail");
				System.out.println("|4| - Aleatória");
				int chave = input.nextInt();

				switch (chave) {
				case 1:
					System.out.println("Informe o número CPF/CNPJ: ");
					String cnpj = input.next();

					break;
				case 2:
					System.out.println("Informe o número do celular: ");
					String cel = input.next();

					break;
				case 3:
					System.out.println("Informe o E-mail: ");
					String email = input.next();

					break;
				case 4:
					System.out.println("Informe a chave aleatória: ");
					String cAleatoria = input.next();

					break;
				}
				System.out.println("Digite o valor: ");
				float pix = input.nextInt();
				conta1.pixPagar(pix);
				System.out.printf("Saldo atual: R$%.2f \n", conta1.getSaldo());
				conta1.estadoAtual();
				break;
		

			case 7:
				conta1.fecharConta();
				conta1.estadoAtual();
				break;

			case 8:
				System.out.println("========== Cadastro da Conta ==========");
				System.out.println("Nome completo: ");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("Informe seu CPF: ");
				cpf = input.nextLine();
				int nConta2 = (int) (1000 + Math.random() * (2000));
				System.out.println("Número da conta: " + nConta2 + "-2");
				conta2.setSaldo(200);
				System.out.printf("Saldo bônus no valor de R$%.2f \n", conta2.getSaldo());
				System.out.println("Deseja realizar um depósito - |1-SIM| |2-NÃO|: ");
				deposito = input.nextInt();
				if (deposito == 1) {
					System.out.println("Informe o valor para depósito: ");
					float dep2 = input.nextFloat();
					conta1.setSaldo(conta2.getSaldo() + dep2);
				}

				conta2.abrirConta(null);
				conta2.setTitular(nome);
				conta2.setCpf(cpf);
				conta2.setTipo("Conta Especial");
				conta2.setNumConta(nConta2);
				conta2.setStatus(true);
				conta2.abrirContaEsp();
				conta2.estadoAtualEsp();
				break;
			}

		} while (valor != 0);

	}
}
