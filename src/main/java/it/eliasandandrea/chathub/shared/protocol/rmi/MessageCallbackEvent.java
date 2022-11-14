package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.crypto.EncryptedObjectPacket;
import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

import java.rmi.Remote;

public interface MessageCallbackEvent extends Remote {

    //parameter: ServerEvent
    void sendAsyncMessage(EncryptedObjectPacket event);

}
