package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.crypto.Packet;

import java.rmi.Remote;

public interface RMIExchange extends Remote {

    //response: ServerEvent
    //parameter: ClientEvent
    Packet sendMessage(Packet evt, String senderUUID);

}
