package minsait.dominio.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CaixaNotFoundException.class)
    public ResponseEntity<Object> handleUserNotFoundException(CaixaNotFoundException exception, WebRequest request) {

        CaixaApiErrorMessage caixaApiErrorMessage = new CaixaApiErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

        return new ResponseEntity<>(caixaApiErrorMessage, new HttpHeaders(), caixaApiErrorMessage.getStatus());
    }
}

