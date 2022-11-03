package it.eliasandandrea.chathub.shared.protocol.serverEvents;

import it.eliasandandrea.chathub.shared.model.ChatEntity;
import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

public class ChatEntityAddedEvent implements ServerEvent {

    public ChatEntity entity;

}
