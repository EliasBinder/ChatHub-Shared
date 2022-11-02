package it.eliasandandrea.chathub.shared.protocol.sharedEvents;

import it.eliasandandrea.chathub.shared.crypto.CryptManager;
import it.eliasandandrea.chathub.shared.crypto.EncryptedObjectPacket;
import it.eliasandandrea.chathub.shared.model.ChatEntity;
import it.eliasandandrea.chathub.shared.model.Group;
import it.eliasandandrea.chathub.shared.model.User;
import it.eliasandandrea.chathub.shared.protocol.ClientEvent;
import it.eliasandandrea.chathub.shared.protocol.Message;
import it.eliasandandrea.chathub.shared.protocol.ServerEvent;
import it.eliasandandrea.chathub.shared.util.ObjectByteConverter;

import java.security.PrivateKey;
import java.security.PublicKey;

public class MessageEvent implements ClientEvent, ServerEvent {

    public String receiverUUID;
    public String senderUUID;
    public byte[] encryptedMessageObject; //encrypted <? implements Message> object

    public MessageEvent(String senderUUID, ChatEntity receiverUUID, Message message) throws Exception {
        this.receiverUUID = receiverUUID.getUUID();
        this.senderUUID = senderUUID;
        this.encryptedMessageObject = ObjectByteConverter.serialize(CryptManager.encrypt(message, receiverUUID.getPublicKey()));
    }

    public String getReceiverUUID() {
        return receiverUUID;
    }

    public Message getMessage(PrivateKey privateKey) throws Exception {
        EncryptedObjectPacket encryptedObjectPacket = (EncryptedObjectPacket) ObjectByteConverter.deserialize(encryptedMessageObject);
        return (Message) CryptManager.decryptToObjectWithKey(encryptedObjectPacket, privateKey);
    }

}
