package it.eliasandandrea.chathub.shared.protocol.rmi;

import it.eliasandandrea.chathub.shared.crypto.Packet;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIExchange extends Remote {

    //response: ServerEvent
    //parameter: ClientEvent
    Packet sendMessage(Packet evt, String senderUUID) throws RemoteException;

}
