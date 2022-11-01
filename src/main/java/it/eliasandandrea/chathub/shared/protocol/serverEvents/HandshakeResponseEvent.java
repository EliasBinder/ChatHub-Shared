package it.eliasandandrea.chathub.shared.protocol.serverEvents;

import it.eliasandandrea.chathub.shared.model.ChatEntity;
import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

import java.util.LinkedList;

public class HandshakeResponseEvent implements ServerEvent {

    public String uuid;
    public ChatEntity[] chats;

}
