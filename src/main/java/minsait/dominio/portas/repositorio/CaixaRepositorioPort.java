package minsait.dominio.portas.repositorio;

import minsait.dominio.model.CaixaModel;


public interface CaixaRepositorioPort {

    public CaixaModel obterSaldoConsolidado(Long id) throws Exception;
}
