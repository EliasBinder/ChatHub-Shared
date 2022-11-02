package it.eliasandandrea.chathub.shared.model;


import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.io.Serializable;
import java.security.PublicKey;

public class User extends ChatEntity implements Serializable {

    public String username;
    public String UUID;
    public byte[] publicKey;

    public User(String username, PublicKey publicKey) {
        this.username = username;
        if (publicKey != null)
            this.publicKey = CryptManager.publicKeyToBytes(publicKey);
    }

    public String getUsername() {
        return username;
    }

    public String getUUID() {
        return UUID;
    }

    public PublicKey getPublicKey() throws Exception {
        return CryptManager.bytesToPublicKey(publicKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User chatEntity = (User) obj;
            return chatEntity.getUUID().equals(UUID);
        }
        return false;
    }
}
