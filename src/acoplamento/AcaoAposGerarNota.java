package acoplamento;

// Interface criada para melhorar o acoplamento do código. Ao invés de se acoplar ao EnviadorDeEmail e NotaFiscalDao,
// a classe GeradorDeNotaFiscal irá se acoplar a esta interface que será mais estável.

public interface AcaoAposGerarNota {
	
	void executa(NotaFiscal nf);

}
