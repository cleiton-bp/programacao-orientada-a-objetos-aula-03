# TDE Calculadora

Este projeto implementa uma calculadora simples que realiza operações básicas como soma, subtração, multiplicação e divisão em uma lista de números. A calculadora é implementada na classe `Calculadora`, que implementa a interface `IOperacao`.

## Estrutura do Projeto

### Interface `IOperacao`

A interface `IOperacao` define um método genérico `calcular` que deve ser implementado por qualquer classe que realize operações matemáticas. Isso garante que todas as operações sigam um contrato comum, facilitando a extensão e manutenção do código.

### Classe `Calculadora`

A classe `Calculadora` implementa a interface `IOperacao` e fornece métodos específicos para cada operação matemática:

- **Somar**: Itera sobre a lista de números e retorna a soma de todos os elementos.
- **Subtrair**: Começa com o primeiro número da lista e subtrai os subsequentes.
- **Multiplicar**: Itera sobre a lista de números e retorna o produto de todos os elementos.
- **Dividir**: Começa com o primeiro número da lista e divide pelos subsequentes, verificando se há divisão por zero para evitar erros.

### Classe `Main`

A classe `Main` demonstra o uso da classe `Calculadora` realizando operações em uma lista de números. Ela instancia a calculadora, define uma lista de números e imprime os resultados das operações de soma, subtração, multiplicação e divisão.
