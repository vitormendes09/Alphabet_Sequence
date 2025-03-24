📜 Alphabet Sequence
📌 Descrição
Alphabet Sequence é uma aplicação Java que utiliza orientação a objetos, arquitetura limpa (Clean Architecture) e os princípios SOLID para retornar letras do alfabeto com base na posição informada pelo usuário.

Ao informar um número de 1 a 26, o programa retorna a letra correspondente e todas as anteriores.

🚀 Tecnologias Utilizadas
Java (JDK 17 ou superior)
Paradigma de Programação: Orientação a Objetos
Arquitetura: Clean Architecture
Princípios: SOLID
Estrutura de Dados: Lista Encadeada
📂 Estrutura do Projeto
O projeto segue uma arquitetura modularizada, separando responsabilidades em diferentes camadas:

bash
Copy
Edit
AlphabetSequence/
│── src/
│   ├── application/       # Camada de aplicação (Regras de negócio)
│   │   ├── AlphabetService.java
│   │   ├── AlphabetServiceImpl.java
│   │
│   ├── domain/            # Camada de domínio (Entidades e regras)
│   │   ├── LetterNode.java
│   │   ├── AlphabetList.java
│   │
│   ├── infrastructure/     # Infraestrutura (Entrada e saída)
│   │   ├── ConsoleInput.java
│   │   ├── ConsoleOutput.java
│   │
│   ├── Main.java           # Ponto de entrada da aplicação
│
└── README.md               # Documentação
⚙️ Como Executar
🛠️ Pré-requisitos
JDK 17 ou superior instalado no sistema
Terminal ou Prompt de Comando
📥 Compilando o Código
Abra o terminal na raiz do projeto e compile todos os arquivos Java:

sh
Copy
Edit
javac -d out $(find src -name "*.java")
Execute a aplicação:

sh
Copy
Edit
java -cp out Main
📝 Exemplo de Uso
Entrada do Usuário:
sh
Copy
Edit
Digite um número de 1 a 26: 3
Saída Esperada:
sh
Copy
Edit
A, B, C
🏗️ Princípios Aplicados
📌 SOLID
✔ Single Responsibility Principle (SRP)
✔ Open/Closed Principle (OCP)
✔ Liskov Substitution Principle (LSP)
✔ Interface Segregation Principle (ISP)
✔ Dependency Inversion Principle (DIP)

📌 Clean Architecture
O projeto está dividido em camadas independentes:
1️⃣ Domain → Entidades principais (Lista Encadeada e nós)
2️⃣ Application → Regras de negócio (Serviços do alfabeto)
3️⃣ Infrastructure → Entrada/Saída (Console)
4️⃣ Main → Ponto de entrada

📜 Licença
Este projeto é de uso livre e pode ser modificado ou distribuído conforme necessário.

