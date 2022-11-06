package dio.gof.facade;

import dio.gof.facade.subsistema1.Service;
import dio.gof.facade.subsistema2.Api;

public class Facade {

  public void migrarCliente(String nome, String cep){
    String cidade = Api.getInstancia().recuperarCidade(cep);
    String estado = Api.getInstancia().recuperarEstado(cep);

    Service.gravarCliente(nome, cep, cidade, estado);
  }
}
