package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.crypto.EncryptedObjectPacket;
import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

import java.io.Serializable;

public interface MessageCallbackEvent extends Serializable {

    //parameter: ServerEvent
    void sendAsyncMessage(EncryptedObjectPacket event);

}
