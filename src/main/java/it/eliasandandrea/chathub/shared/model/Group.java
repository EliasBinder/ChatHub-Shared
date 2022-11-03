package it.eliasandandrea.chathub.shared.model;

import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.io.Serializable;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.LinkedList;

public class Group extends ChatEntity implements Serializable {

    public String name;
    public LinkedList<String> participantsUUIDs;
    public byte[] privateKey;

    public Group(String name, PublicKey groupPublicKey, PrivateKey groupPrivateKey) {
        this.name = name;
        this.participantsUUIDs = new LinkedList<>();
        this.publicKey = CryptManager.publicKeyToBytes(groupPublicKey);
        this.privateKey = CryptManager.privateKeyToBytes(groupPrivateKey);
    }

    public String getName() {
        return name;
    }

    public LinkedList<String> getParticipantsUUIDs() {
        return participantsUUIDs;
    }

    public PrivateKey getPrivateKey() throws Exception {
        return CryptManager.bytesToPrivateKey(privateKey);
    }


}
