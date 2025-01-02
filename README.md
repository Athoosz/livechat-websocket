# 🌐 Live Chat WebSocket (Spring Boot, WebSocket, STOMP)

Este projeto é uma implementação de um sistema de **chat ao vivo** utilizando **Spring Boot**, **WebSocket** e **STOMP**. O objetivo do sistema é permitir a comunicação em tempo real entre usuários através de um chat, onde as mensagens podem ser enviadas e recebidas instantaneamente.

---

## 🛠️ Tecnologias Utilizadas
- **Java**
- **Maven**
- **Spring Boot**
- **WebSocket**
- **STOMP**

---

# ☕ O que é WebSocket?

O **WebSocket** é um protocolo de comunicação que estabelece uma conexão persistente e bidirecional entre o cliente e o servidor sobre uma única conexão TCP. Diferentemente das requisições HTTP tradicionais, que são unidirecionais e requerem múltiplas conexões para comunicação contínua, o WebSocket permite que ambos, cliente e servidor, enviem e recebam dados em tempo real sem a necessidade de reestabelecer a conexão. Isso o torna ideal para aplicações que demandam interatividade e atualizações instantâneas, como chats online, jogos multiplayer e sistemas de notificações em tempo real.

# ❔ Como Funciona o WebSocket com STOMP

Embora o WebSocket forneça o canal de comunicação, ele não define um formato específico para as mensagens trocadas. É aqui que entra o **STOMP** (Simple Text Oriented Messaging Protocol), um protocolo de mensagens simples que opera sobre o WebSocket, definindo a estrutura das mensagens e facilitando a comunicação.

## Fluxo de Funcionamento

1. **Conexão WebSocket**  
   O cliente estabelece uma conexão WebSocket com o servidor.

2. **Estabelecimento de Sessão STOMP**  
   Após a conexão, o cliente e o servidor iniciam uma sessão STOMP.

3. **Inscrição em Tópicos**  
   O cliente se inscreve em tópicos específicos (por exemplo, `/topic/messages`) para receber mensagens.

4. **Envio de Mensagens**  
   O cliente envia mensagens para destinos específicos (por exemplo, `/app/chat`).

5. **Distribuição de Mensagens**  
   O servidor recebe as mensagens e as distribui para todos os clientes inscritos nos tópicos relevantes.

6. **Fechamento da Conexão**  
   Quando a comunicação é concluída, a conexão pode ser encerrada pelo cliente ou pelo servidor.

---

## 📦 Como Rodar o Projeto

### 1️⃣ Clonar o Repositório

Primeiro, clone o repositório para sua máquina local:

```bash
git clone https://github.com/Athoosz/livechat-websocket.git

```

### 2️⃣ Iniciar Projeto
#### 🔧 Passo 2.1: Iniciar websocket
```bash
mvn clean install
```
Inicie a aplicação:
```bash
mvn spring-boot:run
```
Ou va até 
```bash
livechatms/src/main/java/com/athosfs/livechatms/LivechatmsApplication.java 
```
E clique em Run

🌐 Acesse o projeto em: http://localhost:8080/
para testar a funcionalidade do chat.

---

## 📂 Estrutura do Projeto

A estrutura do projeto é organizada de forma a facilitar a navegação e o entendimento do código. Abaixo estão os principais componentes e suas responsabilidades:

#### **Config**
- **WebSocketConfig.java**: Contém as configurações para habilitar e configurar o WebSocket na aplicação.

#### **Controllers**
- **LiveChatController.java**: Controlador responsável por gerenciar as operações do chat ao vivo, como envio e recebimento de mensagens.

#### **Models**
- **ChatInput.java**: Representa o modelo de entrada de uma mensagem de chat, contendo o texto e o remetente.
- **ChatOutput.java**: Representa o modelo de saída de uma mensagem de chat, contendo o texto da resposta e o remetente.

#### **App**
- **LivechatmsApplication.java**: Classe principal que inicializa a aplicação Spring Boot e configura os componentes necessários para o funcionamento do chat.

---

## 🌐 Frontend

A camada de frontend é responsável por gerenciar a interface do chat ao vivo. Os arquivos principais são:

#### Arquivos:
- **index.html**: Página principal do frontend, que inclui o layout e os componentes para interação com o chat.
- **main.css**: Arquivo de estilos CSS utilizados para a formatação da página do chat.
- **app.js**: Script JavaScript responsável por gerenciar as funcionalidades do chat, como conexão com o WebSocket, envio de mensagens e exibição das respostas em tempo real.
  
---
