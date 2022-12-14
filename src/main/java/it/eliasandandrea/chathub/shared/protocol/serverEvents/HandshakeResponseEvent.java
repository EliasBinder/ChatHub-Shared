package it.eliasandandrea.chathub.shared.protocol.serverEvents;

import it.eliasandandrea.chathub.shared.model.Group;
import it.eliasandandrea.chathub.shared.model.User;
import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

import java.util.LinkedList;

public class HandshakeResponseEvent implements ServerEvent {

    public String uuid;
    public byte[] serverPublicKey;
    public LinkedList<User> users;
    public LinkedList<Group> groups;

}
