package it.eliasandandrea.chathub.shared.model;


import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.io.Serializable;
import java.security.PublicKey;

public class User extends ChatEntity implements Serializable {

    public String username;

    public User(String username, PublicKey publicKey) {
        this.username = username;
        if (publicKey != null)
            this.publicKey = CryptManager.publicKeyToBytes(publicKey);
    }

    public String getUsername() {
        return username;
    }
}
