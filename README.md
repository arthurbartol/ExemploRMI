# Exemplo de Calculadora com Java RMI

Este projeto é um exemplo simples de uma calculadora distribuída utilizando **Java RMI (Remote Method Invocation)**. Ele demonstra como métodos remotos podem ser invocados em diferentes JVMs, facilitando a comunicação entre cliente e servidor.

## Funcionalidades
A calculadora suporta as seguintes operações:
- Adição
- Subtração
- Multiplicação
- Divisão (com tratamento de divisão por zero)

## Estrutura do Projeto
- **`CalculatorInterface.java`**: Define a interface remota para os métodos da calculadora.
- **`CalculatorImpl.java`**: Implementa os métodos definidos na interface.
- **`Server.java`**: Configura e inicia o servidor RMI, expondo a calculadora como um serviço remoto.
- **`Client.java`**: Conecta-se ao serviço remoto e executa chamadas aos métodos da calculadora.

## Pré-requisitos
- **Java JDK 8** ou superior
- Configuração básica do ambiente Java
- Porta **1099** disponível para o registro RMI

## Instruções para Execução

### 1. Compilar os Arquivos
No terminal, compile todos os arquivos `.java`:
```bash
javac *.java
```

### 2. Iniciar o Registro RMI
Execute o comando a seguir para iniciar o rmiregistry:
```bash
rmiregistry &
```

### 3. Iniciar o Servidor
No mesmo diretório, execute o servidor:
```bash
java Server
```
Você verá a mensagem:
Calculator Service is running...

### 4. Executar o Cliente
Em outro terminal, execute o cliente para interagir com a calculadora:
```bash
java Client
```
O cliente exibirá os resultados das operações definidas.