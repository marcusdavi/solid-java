package srp;

// Princ�pio de Segrega��o de Interfaces, ou ISP

//Pense, se a classe A depende de B, idealmente B 
//deve prover uma interface para A, somente com 
//as coisas que A depende. Ou seja, a classe 
//n�o deve depender de m�todos que ela n�o usa.
// I do SOLID

public interface RegraDeCalculo {

	public double calcula(Funcionario funcionario);

}
 