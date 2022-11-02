package it.eliasandandrea.chathub.shared.protocol.serverEvents;

import it.eliasandandrea.chathub.shared.protocol.ServerEvent;

public class ChangeUsernameEvent implements ServerEvent {

    public String username;
    public String uuid;

}
