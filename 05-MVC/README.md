# MVC - Model, View, Controller

- Padrão arquitetural que divide os elementos da nossa aplicação em três camadas
  - Modelo
    - Gerenciar as Entidades do nosso sistema.
    - Lidar com informações da nossa aplicação.
    - Receber, tratar e validar todos os dados.
    - Conectar a base de dados.
  - Visão
    - Camada de interação do usuário com o sistema.
    - Renderizar componentes que fazem parte da experiência da aplicação.
  - Controlador
    - Receber, tratar e responder requisições e eventos do usuário.
    - Solicitar ao Model os dados necessários.
    - Encaminhar resposta do Model para o View.
    - Capturar dados na View e encaminha para o Model.