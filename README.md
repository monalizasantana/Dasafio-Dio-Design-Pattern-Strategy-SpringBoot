# Desafio DIO - Desenvolver uma solução que explore o conceito de Padrões de Projetos
Agenda Telefônica em Java usando o Spring Boot e o design pattern Strategy


## Nesse desafio foi utilizado o Design Paternes Strategy  com Spring Boot.]

Foi desenvolvida uma aplicação simples web de agenda telefônica em Java usando o Spring Boot e o padrão de design Strategy. 
Essa aplicação permitirá adicionar e listar contatos em diferentes estratégias de armazenamento, como em memória e em banco de dados. Além disso, 
usa o padrão Strategy para alternar entre diferentes estratégias de aramazenamento.

## Singleton

O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.

### O padrão Singleton resolve dois problemas de uma só vez, violando o princípio de responsabilidade única:

Garantir que uma classe tenha apenas uma única instância. Por que alguém iria querer controlar quantas instâncias uma classe tem? A razão mais comum para isso é para controlar o acesso a algum recurso compartilhado—por exemplo, uma base de dados ou um arquivo.

Funciona assim: imagine que você criou um objeto, mas depois de um tempo você decidiu criar um novo. Ao invés de receber um objeto fresco, você obterá um que já foi criado.

Observe que esse comportamento é impossível implementar com um construtor regular uma vez que uma chamada do construtor deve sempre retornar um novo objeto por design.

### Fornece um ponto de acesso global para aquela instância. Se lembra daquelas variáveis globais que você (tá bom, eu) usou para guardar alguns objetos essenciais? Embora sejam muito úteis, elas também são muito inseguras uma vez que qualquer código pode potencialmente sobrescrever os conteúdos daquelas variáveis e quebrar a aplicação.

Assim como uma variável global, o padrão Singleton permite que você acesse algum objeto de qualquer lugar no programa. Contudo, ele também protege aquela instância de ser sobrescrita por outro código.

Há outro lado para esse problema: você não quer que o código que resolve o problema #1 fique espalhado por todo seu programa. É muito melhor tê-lo dentro de uma classe, especialmente se o resto do seu código já depende dela.

Hoje em dia, o padrão Singleton se tornou tão popular que as pessoas podem chamar algo de singleton mesmo se ele resolve apenas um dos problemas listados.

## 
Todas as implementações do Singleton tem esses dois passos em comum:

Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton.

Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo dos panos para criar um objeto e o salva em um campo estático. Todas as chamadas seguintes para esse método retornam o objeto em cache.

Se o seu código tem acesso à classe singleton, então ele será capaz de chamar o método estático da singleton. Então sempre que aquele método é chamado, o mesmo objeto é retornado.

##
 ![image](https://github.com/monalizasantana/Dasafio-Dio-Design-Pattern-Strategy-SpringBoot/assets/25212459/9fdccf81-e570-4efd-8d98-8c00d9055212)
 
A classe Singleton declara o método estático getInstance que retorna a mesma instância de sua própria classe.

O construtor da singleton deve ser escondido do código cliente. Chamando o método getInstance deve ser o único modo de obter o objeto singleton.


##
 Aplicabilidade
 
 * Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.

*  O padrão Singleton desabilita todos os outros meios de criar objetos de uma classe exceto pelo método especial de criação. Esse método tanto cria um novo objeto ou retorna um objeto existente se ele já tenha sido criado.

 * Utilize o padrão Singleton quando você precisa de um controle mais estrito sobre as variáveis globais.

 * Ao contrário das variáveis globais, o padrão Singleton garante que há apenas uma instância de uma classe. Nada, a não ser a própria classe singleton, pode substituir a instância salva em cache.


Observe que você sempre pode ajustar essa limitação e permitir a criação de qualquer número de instâncias singleton. O único pedaço de código que requer mudanças é o corpo do método getInstance.
##
