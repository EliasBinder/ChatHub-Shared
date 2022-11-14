package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.protocol.ClientEvent;
import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

import java.rmi.Remote;

public interface RMIExchange extends Remote {

    ServerEvent sendMessage(ClientEvent evt);

}
