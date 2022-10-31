package it.eliasandandrea.chathub.shared.model;

import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.io.Serializable;
import java.security.PublicKey;

public abstract class ChatEntity implements Serializable {

    public String UUID;
    public byte[] publicKey;

    public String getUUID() {
        return UUID;
    }

    public PublicKey getPublicKey() throws Exception {
        return CryptManager.bytesToPublicKey(publicKey);
    }

}
