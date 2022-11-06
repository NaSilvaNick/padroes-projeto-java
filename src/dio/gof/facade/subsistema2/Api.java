package dio.gof.facade.subsistema2;

public class Api {
  private static Api instancia = new Api();

  private Api() {
    super();
  }

  public static Api getInstancia() { return instancia; }

  public String recuperarCidade(String cep){
    return "Praia Grande";
  }

  public String recuperarEstado(String cep){
    return "São Paulo";
  }

}
