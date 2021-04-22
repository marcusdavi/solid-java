# solid-java

## O que é SOLID? 
SOLID é o acrônimo, é o conjunto de 5 boas práticas em relação a Orientação a objetos, cada letra fala de uma prática em particular.

### S — Single Responsiblity Principle (Princípio da responsabilidade única)
 * A tradução disso, de maneira simples, é coesão.
 * Tenha classes coesas.
 * Uma classe deve ter um, e somente um, motivo para mudar.
 * uma classe deve ser especializada em um único assunto e possuir apenas uma responsabilidade dentro do software
 
### O — Open-Closed Principle (Princípio Aberto-Fechado)
 * Aberto para extensão, fechado para modificação. 
 * A ideia é que as suas Classes sejam abertas para extensão. Eu tenho que conseguir estendê-la, ou seja, mudar o comportamento dela, de maneira fácil.
 * Mas ela tem que estar fechada para alteração. Eu não tenho que ficar o tempo inteiro indo nela pra mexer um if a mais, para fazer uma modificação ou coisa do tipo.
 * Quando novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o código fonte original.

### L — Liskov Substitution Principle (Princípio da substituição de Liskov)
 * Pra você usar herança, você tem que pensar muito bem nas pré-condições e pós-condições da classe antes de criar suas "filhas".
 * Uma classe derivada deve ser substituível por sua classe base.

### I — Interface Segregation Principle (Princípio da Segregação da Interface)
 * se a classe A depende de B, idealmente B deve prover uma interface para A, somente com as coisas que A depende. Ou seja, a classe não deve depender de métodos que ela não usa.
 * Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.

### D — Dependency Inversion Principle (Princípio da inversão da dependência)
 * Uma classe sempre deve depender, se necessário, de uma classe mais estável.
 * Dependa de abstrações e não de implementações.

