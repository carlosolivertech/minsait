package minsait.aplicacao.http.dto;

public class CaixaDto {

    private Long saldoDiario;

    private Long debito;

    private Long credito;

    private String documento;

    private String descricao;

    public Long getSaldoDiario() {
        return saldoDiario;
    }

    public void setSaldoDiario(Long saldoDiario) {
        this.saldoDiario = saldoDiario;
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
