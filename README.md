## 🗓️ Agendador de Horários API

API REST para gerenciamento de agendamentos com validação inteligente de horários.

🚀 Desenvolvido com Java e Spring Boot

---

## 📌 Sobre o projeto

Esta aplicação simula um sistema real de agendamento, aplicando regras de negócio para evitar conflitos de horários.  
A API permite o gerenciamento completo de agendamentos, garantindo que um mesmo serviço não seja reservado em intervalos sobrepostos.

---

## ⚙️ Funcionalidades

- Criar agendamentos  
- Validar conflito de horários (intervalo mínimo de 1 hora)  
- Listar agendamentos por dia  
- Atualizar agendamentos  
- Remover agendamentos  

---

## 🧠 Regra de Negócio

Não é permitido agendar o mesmo serviço em um intervalo menor que 1 hora.  
Caso isso ocorra, o sistema retorna: **"Horário já está preenchido"**

---

## 🛠️ Tecnologias

- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Banco de dados H2  
- Maven  
