package minsait.dominio.exception;

public class CaixaNotFoundException extends RuntimeException {

    public CaixaNotFoundException(Long id) {
        super(String.format("relatorio %d not found.", id));
    }
}
