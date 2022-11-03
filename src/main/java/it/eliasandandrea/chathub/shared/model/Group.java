package it.eliasandandrea.chathub.shared.model;

import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.io.Serializable;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.LinkedList;

public class Group extends ChatEntity implements Serializable {

    public String name;
    public LinkedList<User> participants;
    public byte[] privateKey;

    public Group(String name, PublicKey groupPublicKey, PrivateKey groupPrivateKey) {
        this.name = name;
        this.publicKey = CryptManager.publicKeyToBytes(groupPublicKey);
        this.privateKey = CryptManager.privateKeyToBytes(groupPrivateKey);
    }

    public String getName() {
        return name;
    }

    public LinkedList<User> getParticipants() {
        return participants;
    }

    public PrivateKey getPrivateKey() throws Exception {
        return CryptManager.bytesToPrivateKey(privateKey);
    }


}
