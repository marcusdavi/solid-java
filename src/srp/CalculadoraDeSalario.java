package srp;

//O que é SOLID? 
//SOLID é o acrônimo, é o conjunto de 5 boas práticas em relação
//a Orientação a objetos, cada letra fala de uma prática em particular.

//O S** nos remete ao **SRP, o Single Responsibility Principle ?
//em português, Princípio da Responsabilidade Única.
//A tradução disso, de maneira simples, é coesão.
//Tenha classes coesas. E aqui, eu discuti com vocês
//uma maneira de eu conseguir isso, e mais,
//eu discuti uma maneira de observar que as classes não são coesas.

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.calcula(funcionario);
	}
}
