package it.eliasandandrea.chathub.shared.model;

import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.LinkedList;

public class Group extends ChatEntity{

    String name;
    User[] participants;
    byte[] privateKey;

    public Group(String name, User[] participants, PublicKey groupPublicKey, PrivateKey groupPrivateKey) {
        this.name = name;
        this.participants = participants;
        if (publicKey != null)
            this.publicKey = CryptManager.publicKeyToBytes(groupPublicKey);
        if (privateKey != null)
            this.privateKey = CryptManager.privateKeyToBytes(groupPrivateKey);
    }

    public String getName() {
        return name;
    }

    public User[] getParticipants() {
        return participants;
    }

    public PrivateKey getPrivateKey() throws Exception {
        return CryptManager.bytesToPrivateKey(privateKey);
    }


}
