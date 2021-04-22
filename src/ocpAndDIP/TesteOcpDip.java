package ocpAndDIP;

// OCP (Open Closed Principle) - Aberto para extens�o, fechado para modifica��o. 
// A ideia � que as suas Classes sejam abertas para extens�o. Ou seja, eu tenho que conseguir estend�-la, ou seja,
// mudar o comportamento dela, de maneira f�cil. Mas ela tem que estar fechada para altera��o.
// Ou seja, eu n�o tenho que ficar o tempo inteiro indo nela pra mexer um if a mais, 
// para fazer uma modifica��o ou coisa do tipo.
// O do SOLID


// DIP - Invers�o de depend�ncias. Uma classe sempre deve depender, se necess�rio, de uma classe mais est�vel.
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
