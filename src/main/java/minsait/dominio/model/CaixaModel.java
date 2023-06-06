package minsait.dominio.model;

public class CaixaModel {

    private TipoTransacao tipo;

    private Long saldo;

    private Long debito;

    private Long credito;

    private String documento;

    private String descricao;

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    public Long getDebito() {
        return debito;
    }

    public void setDebito(Long debito) {
        this.debito = debito;
    }

    public Long getCredito() {
        return credito;
    }

    public void setCredito(Long credito) {
        this.credito = credito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
