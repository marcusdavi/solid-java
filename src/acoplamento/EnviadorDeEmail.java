package acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("Email enviado!");
	}
}
