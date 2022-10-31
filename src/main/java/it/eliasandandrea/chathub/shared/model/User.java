package it.eliasandandrea.chathub.shared.model;


import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.security.PublicKey;

public class User extends ChatEntity{

    String username;

    public User(String username, PublicKey publicKey) {
        this.username = username;
        this.publicKey = CryptManager.publicKeyToBytes(publicKey);
    }

    public String getUsername() {
        return username;
    }

}
