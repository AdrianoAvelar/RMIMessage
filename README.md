RMIMessage
==========

Classe simplificada para criar comunicação usando java RMI entre um cliente e um servidor.

Abra um terminal.

Acesse a basta {RMIMessage}/bin do projeto

Execute a ferramenta "rmiregistry". 

$rmiregistry

Caso a ferramenta não seja encontrada, colocar a pasta "C:\Program Files\Java\jdk1.(versão do JDK)\bin" dentro do PATH do sistema.

Abra outro terminal acesse a pasta {RMIMessage}/bin e execute o servidor:

$java com.adriano.rmi.server.Servidor

Se a saida for: "Mensageiro vinculado ao serviþo de nome 'MensageiroServico'" O serviço está rodando e o cliente pode invocá-lo.

Por fim, execute o cliente.
