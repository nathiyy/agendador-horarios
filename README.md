🗓️ Agendador de Horários API
<p align="center"> <b>API REST para gerenciamento de agendamentos com validação inteligente de horários</b> </p> <p align="center"> 🚀 Desenvolvido com Java + Spring Boot </p>
✨ Sobre o projeto

Esta aplicação foi desenvolvida com o objetivo de simular um sistema real de agendamento, aplicando regras de negócio essenciais para evitar conflitos de horários.

A API permite o gerenciamento completo de agendamentos, garantindo que um mesmo serviço não seja reservado em intervalos sobrepostos.

🚀 Funcionalidades

✔️ Criar agendamentos
✔️ Validação de conflito de horários (intervalo de 1 hora)
✔️ Listar agendamentos por dia
✔️ Atualizar agendamentos
✔️ Remover agendamentos

🧠 Regra de Negócio

Não é permitido agendar o mesmo serviço em um intervalo menor que 1 hora.

Caso isso ocorra, o sistema retorna:

Horário já está preenchido
🛠️ Tecnologias
<p> <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java"/> <img src="https://img.shields.io/badge/Spring%20Boot-Framework-green?style=for-the-badge&logo=springboot"/> <img src="https://img.shields.io/badge/JPA-Hibernate-blue?style=for-the-badge"/> <img src="https://img.shields.io/badge/H2-Database-lightgrey?style=for-the-badge"/> <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven"/> </p>
📡 Endpoints
Método	Endpoint	Descrição
POST	/agendamentos	Criar agendamento
GET	/agendamentos?data=YYYY-MM-DD	Buscar por dia
PUT	/agendamentos	Atualizar
DELETE	/agendamentos	Deletar
🧪 Exemplo de requisição
{
  "produto": "Produto Teste",
  "servico": "Depilação",
  "profissional": "Maria",
  "dataHoraAgendamento": "2026-04-08T14:30:00",
  "cliente": "Claudia",
  "telefoneCliente": "47999999999"
}
▶️ Como executar o projeto
git clone https://github.com/SEU-USUARIO/agendador-horarios.git
cd agendador-horarios
./mvnw spring-boot:run
🌐 Acesso
API: http://localhost:8080/agendamentos
H2 Console: http://localhost:8080/h2-console
🧱 Arquitetura
Controller → Entrada da API  
Service → Regras de negócio  
Repository → Acesso ao banco  
Entity → Modelagem dos dados  
🎯 Objetivo

Este projeto foi desenvolvido com foco em:

Construção de APIs REST
Aplicação de regras de negócio reais
Organização em camadas (boas práticas)
Integração com banco de dados
