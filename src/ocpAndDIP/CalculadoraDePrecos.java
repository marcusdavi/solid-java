package ocpAndDIP;

public class CalculadoraDePrecos {

	private TabeladePreco tabela;
	private ServicoDeEntrega entrega;

	public CalculadoraDePrecos(TabeladePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
		
	}
	
	public double calcula(Compra compra) {

		double desconto = tabela.descontoPara(compra.getValor());
		double frete = entrega.para(compra.getCidade());

		return compra.getValor() * (1 - desconto) + frete;
	}

}
