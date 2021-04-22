package srp;

//O que � SOLID? 
//SOLID � o acr�nimo, � o conjunto de 5 boas pr�ticas em rela��o
//a Orienta��o a objetos, cada letra fala de uma pr�tica em particular.

//O S** nos remete ao **SRP, o Single Responsibility Principle ?
//em portugu�s, Princ�pio da Responsabilidade �nica.
//A tradu��o disso, de maneira simples, � coes�o.
//Tenha classes coesas. E aqui, eu discuti com voc�s
//uma maneira de eu conseguir isso, e mais,
//eu discuti uma maneira de observar que as classes n�o s�o coesas.

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.calcula(funcionario);
	}
}
