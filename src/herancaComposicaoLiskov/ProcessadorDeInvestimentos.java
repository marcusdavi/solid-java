package herancaComposicaoLiskov;

// A sigla LSP significa Liskov Subtitutive Principle, Princípio de Substituição de Liskov
// Pra você usar herança, você tem que pensar muito bem nas pré-condições da sua classe
// e nas pós-condições da sua classe
// L do SOLID

// Para contonar o problema deve-se usar composição. Para este exemplo verificamos que ContaComum e Estudante
// basicamente manipulavam o saldo, daí criamos uma classe ManipuladordeSaldo e fizemos composição.

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

		for (ContaComum conta : contasDoBanco()) {
			conta.rende();
			System.out.println("Novo Saldo: " + conta.getSaldo());
		}
		
		for (ContaDeEstudante conta : contasDoBancoEstudante()) {
			System.out.println("Novo Saldo: " + conta.getSaldo());
		}
	}

	private static List<ContaComum> contasDoBanco() {
		return Arrays.asList(umaContaCom(100), umaContaCom(150), umaContaCom(200));
	}
	
	private static List<ContaDeEstudante> contasDoBancoEstudante() {
		return Arrays.asList(contaDeEstudanteCom(100), contaDeEstudanteCom(150), contaDeEstudanteCom(200));
	}

	private static ContaDeEstudante contaDeEstudanteCom(double amount) {
		ContaDeEstudante c = new ContaDeEstudante();
		c.deposita(amount);
		return c;
	}

	private static ContaComum umaContaCom(double valor) {
		ContaComum c = new ContaComum();
		c.deposita(valor);
		return c;
	}
}
