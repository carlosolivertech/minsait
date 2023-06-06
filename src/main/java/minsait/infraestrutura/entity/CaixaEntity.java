package minsait.infraestrutura.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "caixa")
@Entity
public class CaixaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String documento;
    private String descricao;
    private Long debito;
    private Long credito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
