package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.crypto.EncryptedObjectPacket;
import it.eliasandandrea.chathub.shared.protocol.clientEvents.HandshakeRequestEvent;
import it.eliasandandrea.chathub.shared.protocol.serverEvents.HandshakeResponseEvent;

import java.rmi.Remote;

public interface RMIHandshake extends Remote {

    //responst is a HandshakeResponseEvent encrypted using an EncryptedObjectPacket
    EncryptedObjectPacket doHandshake(HandshakeRequestEvent evt, MessageCallbackEvent event);

}
