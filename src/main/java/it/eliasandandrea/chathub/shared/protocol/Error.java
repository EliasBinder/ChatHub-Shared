package it.eliasandandrea.chathub.shared.protocol;

public class Error implements ClientEvent, ServerEvent {

    private final String exceptionClass;
    private final String exceptionMessage;

    public Error(String exceptionClass, String exceptionMessage) {
        this.exceptionClass = exceptionClass;
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionClass() {
        return exceptionClass;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
