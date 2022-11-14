package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.crypto.EncryptedObjectPacket;

import java.rmi.Remote;

public interface RMIExchange extends Remote {

    //response: ServerEvent
    //parameter: ClientEvent
    EncryptedObjectPacket sendMessage(EncryptedObjectPacket evt);

}
