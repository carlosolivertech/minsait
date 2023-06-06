package minsait.dominio.service;

import minsait.dominio.model.CaixaModel;
import minsait.dominio.portas.repositorio.CaixaRepositorioPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CaixaService {

    @Autowired
    private CaixaRepositorioPort port;

    public CaixaModel obterSaldoConsolidado(Long id) throws Exception {
        CaixaModel response = port.obterSaldoConsolidado(id);

        response.setSaldo((response.getCredito() + response.getDebito()));

        return response;
    }
}
