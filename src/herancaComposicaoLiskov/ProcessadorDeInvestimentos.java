package herancaComposicaoLiskov;

// A sigla LSP significa Liskov Subtitutive Principle, Princ�pio de Substitui��o de Liskov
// Pra voc� usar heran�a, voc� tem que pensar muito bem nas pr�-condi��es da sua classe
// e nas p�s-condi��es da sua classe
// L do SOLID

// Para contonar o problema deve-se usar composi��o. Para este exemplo verificamos que ContaComum e Estudante
// basicamente manipulavam o saldo, da� criamos uma classe ManipuladordeSaldo e fizemos composi��o.

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
