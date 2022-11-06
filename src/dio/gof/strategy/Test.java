package dio.gof.strategy;

public class Test {

  public static void main(String[] args) {

    // Testes relacionados ao Design Pattern Strategy;

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();

    robo.setComportamento(normal);
    robo.mover();
    System.out.println("\n");

    robo.setComportamento(defensivo);
    robo.mover();
    robo.mover();
    System.out.println("\n");

    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();
    System.out.println("\n");
  }
}
