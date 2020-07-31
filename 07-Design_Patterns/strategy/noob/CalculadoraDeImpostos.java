package strategy.noob;

public class CalculadoraDeImpostos {

  public double calcular(String imposto, double valor) {
    if (imposto.equals("ICMS"))
      return valor * 0.1;
    if (imposto.equals("IPI"))
      return valor * 0.2;
    if (imposto.equals("NOVO_IMPOSTO"))
      return valor * 0.5;
    return valor;
  }

  public CalculadoraDeImpostos() {
    super();
  }
}