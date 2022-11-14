package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

import java.rmi.Remote;

public interface MessageCallbackEvent extends Remote {

    void sendAsyncMessage(ServerEvent event);

}
