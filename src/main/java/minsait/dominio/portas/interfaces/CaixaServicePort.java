package minsait.dominio.portas.interfaces;

import minsait.dominio.model.CaixaModel;


public interface CaixaServicePort {
    public CaixaModel obterSaldoConsolidado(Long id);
}
