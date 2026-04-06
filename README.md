🗓️ Agendador de Horários API <p align="center"> <b>API REST para gerenciamento de agendamentos com validação inteligente de horários</b> </p> <p align="center"> 🚀 Desenvolvido com Java + Spring Boot </p>

✨ Sobre o projeto

Esta aplicação foi desenvolvida com o objetivo de simular um sistema real de agendamento, aplicando regras de negócio essenciais para evitar conflitos de horários.
A API permite o gerenciamento completo de agendamentos, garantindo que um mesmo serviço não seja reservado em intervalos sobrepostos. 

🚀 Funcionalidades
✔️ Criar agendamentos 
✔️ Validação de conflito de horários (intervalo de 1 hora) 
✔️ Listar agendamentos por dia 
✔️ Atualizar agendamentos 
✔️ Remover agendamentos 

🧠 Regra de Negócio Não é permitido agendar o mesmo serviço em um intervalo menor que 1 hora. Caso isso ocorra, o sistema retorna: 
Horário já está preenchido 

🛠️ Tecnologias <p> <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java"/> <img src="https://img.shields.io/badge/Spring%20Boot-Framework-green?style=for-the-badge&logo=springboot"/> <img src="https://img.shields.io/badge/JPA-Hibernate-blue?style=for-the-badge"/> <img src="https://img.shields.io/badge/H2-Database-lightgrey?style=for-the-badge"/> <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven"/> </p>
