package it.eliasandandrea.chathub.shared.model;

import it.eliasandandrea.chathub.shared.crypto.CryptManager;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.LinkedList;

public class Group extends ChatEntity{

    public String name;
    public User[] participants;
    public byte[] privateKey;

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

    public void addUser(User user) {
        LinkedList<User> users = new LinkedList<>();
        for (User u : participants)
            users.add(u);
        users.add(user);
        participants = users.toArray(new User[0]);
    }

    public void removeUser(User user) {
        LinkedList<User> users = new LinkedList<>();
        for (User u : participants)
            if (!u.getUUID().equals(user.getUUID()))
                users.add(u);
        participants = users.toArray(new User[0]);
    }


}
