# Tópicos de Arquitetura de Software

## **Adapter pattern**

O padrão Adapter é muito utilizado quando precisamos encaixar uma nova biblioteca de classes, adquirida de um fornecedor, em um sistema de software já existente, porém essas bibliotecas de classe do novo fornecedor são diferentes das bibliotecas de classes do fornecedor antigo. Como não temos o código do novo fornecedor e também não podemos alterá-la, o que pode ser feito é criar uma classe que faça essa adaptação, ou seja, ela é responsável por adaptar a interface do novo fornecedor ao formato que o sistema espera. O Adapter é muito utilizado para compatibilizar o seu sistema a outros frameworks ou APIs.

Portanto, o adaptador é um intermediador que recebe solicitações do cliente e converte essas solicitações num formato que o fornecedor entenda. O adaptador converte uma interface para outra, porém, também poderíamos ter um caso em que precisaríamos adaptar mais de uma classe, nesse caso entra em cena outro padrão de projeto chamado Facade (Fachada) que é discutido em outro artigo. Se a interface do fornecedor mudar novamente apenas o Adaptador necessitará ser modificado sem alterar o resto do sistema.

A definição oficial do padrão Adapter é: “O Padrão Adapter converte uma interface de uma classe para outra interface que o cliente espera encontrar. O Adaptador permite que classes com interfaces incompatíveis trabalhem juntas”.

Referência: [Padrão de Projeto Adapter em Java](https://www.devmedia.com.br/padrao-de-projeto-adapter-em-java/26467)
