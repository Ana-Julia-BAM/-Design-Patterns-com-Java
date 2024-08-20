package Facade;



import subsistema.CrmService;

import subsistema2.CepApi;

public class Facade {
    public void migragCliente(String nome, String cep){
        String Cidade = CepApi.getInstancia().recuperarCidade(cep);
        String Estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }

}
