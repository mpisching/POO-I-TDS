package br.edu.ifsc.fln.exceptions;

public class VendaException extends Exception {
    public VendaException(String message) {
        super(message);
    }

    public VendaException(String message, Throwable cause) {
        super(message, cause);
    }
}
