# Plot API
API desenvolvida para transformar o hábito de leitura em uma experiência gamificada. O sistema atua como um motor de regras que calcula Experiência(XP), metas diárias e ofensivas(streaks) em tempo real.

## 1. Stacks
* Java 17
* Spring Boot 3
* Maven
* Swagger / OpenAPI 3(Documentação interativa)
* Bean Validation(Segurança e integridade de dados)

## 2. Funcionalidades Principais
* **Gestão de Biblioteca:** Cadastro e acompanhamento de leituras.
* **Sistema de Recompensas:** Cálculo automático de XP base e bônus por superação de metas.
* **Habit Tracker:** Validação de dias consecutivos(Streak) e reset automático em caso de falha.
* **Arquitetura Limpa:** Validações de entrada diretamente no Controller para garantir a integridade da persistência.

## 3. Como Executar
1. Clone o repositório: `git clone https://github.com/luismiguel-developer/plot-api-project-LP2-U2`
2. Abra a pasta do projeto no seu terminal.
3. Execute a aplicação via Maven: `./mvnw spring-boot:run`
4. O servidor iniciará localmente na porta `8080`.

A documentação completa e interativa dos endpoints pode ser acessada e testada via interface gráfica assim que o servidor estiver rodando.
* **Acesso:** `http://localhost:8080/swagger-ui/index.html`

---
*Projeto desenvolvido para o Checkpoint 2 da disciplina de Linguagem de Programação 2 (UFRN). Professor: João Anisio.*