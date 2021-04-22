package srp;

// Princípio de Segregação de Interfaces, ou ISP

//Pense, se a classe A depende de B, idealmente B 
//deve prover uma interface para A, somente com 
//as coisas que A depende. Ou seja, a classe 
//não deve depender de métodos que ela não usa.
// I do SOLID

public interface RegraDeCalculo {

	public double calcula(Funcionario funcionario);

}
 