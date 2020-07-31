# MVVM - Model, View, ViewModel

- Padrão arquitetural que divide os elementos da nossa aplicação em três camadas
  - Modelo
    - Regras de negócio.
    - Encapsular dados.
    - Prover notificações através da interface (INotifyPropertyChanged).
  - Visão
    - Camada de interação do usuário com a aplicação.
    - Renderizar componentes que fazem parte da experiência da aplicação.
    - Define a aparência e estrutura do que o usuário visualiza na tela.
    - Normalmente contém um Code-Behind sobre a lógica dessa interface.
    - Deve possuir um Binding Context indicando qual ViewModel está referenciada.
  - ViewModel
    - Tratar da Lógica de controles.
    - Não conhece a View.
    - Lançar notificações de estado ou de alterações (OnNotifyPropertyChanged).