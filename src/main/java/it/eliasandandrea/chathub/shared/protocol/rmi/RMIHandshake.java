package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.crypto.Packet;
import it.eliasandandrea.chathub.shared.protocol.clientEvents.HandshakeRequestEvent;

import java.rmi.Remote;

public interface RMIHandshake extends Remote {

    //response is a HandshakeResponseEvent encrypted using an EncryptedObjectPacket
    Packet doHandshake(HandshakeRequestEvent evt, MessageCallbackEvent event);

}
