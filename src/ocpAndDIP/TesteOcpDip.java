package ocpAndDIP;

// OCP (Open Closed Principle) - Aberto para extensão, fechado para modificação. 
// A ideia é que as suas Classes sejam abertas para extensão. Ou seja, eu tenho que conseguir estendê-la, ou seja,
// mudar o comportamento dela, de maneira fácil. Mas ela tem que estar fechada para alteração.
// Ou seja, eu não tenho que ficar o tempo inteiro indo nela pra mexer um if a mais, 
// para fazer uma modificação ou coisa do tipo.
// O do SOLID


// DIP - Inversão de dependências. Uma classe sempre deve depender, se necessário, de uma classe mais estável.
// D do SOLID

public class TesteOcpDip {
	
	public static void main(String[] args)  {
		
		TabeladePreco tabela = new TabelaDePrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
		
		Compra compra = new Compra("SAO PAULO", 1200.0);
		
        CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
        
        System.out.println(calculadora.calcula(compra));
        
        
    }

}
