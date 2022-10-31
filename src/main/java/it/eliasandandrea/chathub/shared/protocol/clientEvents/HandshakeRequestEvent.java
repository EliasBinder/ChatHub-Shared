package it.eliasandandrea.chathub.shared.protocol.clientEvents;

import it.eliasandandrea.chathub.shared.protocol.ClientEvent;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class HandshakeRequestEvent implements ClientEvent {

    public byte[] publicKey;

    public HandshakeRequestEvent(PublicKey publicKey, String username) {
        this.publicKey = publicKey.getEncoded();
    }

    public PublicKey getPublicKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(publicKey));
    }

}
