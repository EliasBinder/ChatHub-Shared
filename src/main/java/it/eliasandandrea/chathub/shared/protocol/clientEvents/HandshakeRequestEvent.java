package it.eliasandandrea.chathub.shared.protocol.clientEvents;

import it.eliasandandrea.chathub.shared.crypto.CryptManager;
import it.eliasandandrea.chathub.shared.protocol.ClientEvent;

import java.security.PublicKey;

public class HandshakeRequestEvent implements ClientEvent {

    public byte[] publicKey;

    public HandshakeRequestEvent(PublicKey publicKey, String username) {
        this.publicKey = publicKey.getEncoded();
    }

    public PublicKey getPublicKey() throws Exception {
        return CryptManager.bytesToPublicKey(publicKey);
    }

}
