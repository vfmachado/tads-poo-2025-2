# TRABALHO II

# ENTREGA E APRESENTACAO DIA XX/10/25

SISTEMA DE UMA CLINICA
Sistema de agendamentos de consultas médicas.
Realização de exames
Gera o prontuario (consultas e exames) da consulta para historico.

Medica, Tecnico e Paciente Herdam de Pessoa.
Medico e o Tecnico são responsaveis

Tecnico
    - pode dar laudo de um exame

Medica
    - nome
    - cpf
    - email
    - telefone

    - crm
    - especialidades

    - Agenda de disponibilidade e consultas

    + abrirAgenda (data): void -> abre os horarios das 9 as 17 (de hora em hora) com slots para consultas em determinada data
    
    
AgendaDisponibilidade

Paciente
    nome
    cpf
    email
    telefone
    dtNascimento
    sexo
    tipoSanguineo (enum)

    .. dados do paciente
    Historico de consultas

Agendamento

Interface Agendavel

Consulta implementa agendavel
    - Data & Hora
    - Tipo (Enum)
    - Ref Medico
    - Paciente
    - Prontuario

Exame implementa agendavel  - nao necessita de agenda medica
    - nome
    - Data & Hora
    - Responsavel  (tecnico ou medica)
    - laudo (pode ser uma classe ou apenas uma string)

Prontuario
    - detalhes da consulta
    - sintomas
    - exames solicitados (texto)
    - medicamentos


Condicoes Gerais:
* Ao marcar uma consulta em um horairo nao disponivel, deve ser lançada uma exceçao. (AgendaNaoDiponivelException)

* Ao encerrar uma consulta é gerado o seu prontuario
* Ao encerrar um exame é gerado o laudo

Ações que devemos conseguir fazer na plataforma (cada item abaixo vale 1,0 ponto)
* Criar um paciente
* Criar uma medica
* Criar um tecnico
* Disponibilizar Agenda (médico)
* Fazer um agendamento (clinica - médico)
* Quando acontece o agendamento é criada uma consulta
* Encerrar consulta / Gerar prontuario da consulta
* Marcar exame (médico pode solicitar / paciente pode soliciar)
* Encerrar Exame / Gerar Laudo do exame (tecnico ou medico gera um laudo)
* Visualizar historico de um paciente
