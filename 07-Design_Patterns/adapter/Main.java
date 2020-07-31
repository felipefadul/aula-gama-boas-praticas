package adapter;

public class Main {
  public static void main(String[] args) {
    TomadaDeTresPinos tomadaDeTresPinos = new TomadaDeTresPinos();
    AdapterTomada adaptador = new AdapterTomada(tomadaDeTresPinos);
    adaptador.ligarNaTomadaDeDoisPinos();
  }
}

class TomadaDeDoisPinos {
  public void ligarNaTomadaDeDoisPinos() {
    System.out.println("Ligado na Tomada de Dois Pinos");
  }
}

class TomadaDeTresPinos {
  public void ligarNaTomadaDeTresPinos() {
    System.out.println("Ligado na Tomada de Tres Pinos");
  }
}

class AdapterTomada extends TomadaDeDoisPinos {
  public static void main(String[] args) {
    private TomadaDeTresPinos tomadaDeTresPinos;

    public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
      this.tomadaDeTresPinos = tomadaDeTresPinos;
    }

    public void ligarNaTomadaDeDoisPinos() {
      tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
  }
}