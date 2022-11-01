package it.eliasandandrea.chathub.shared.crypto;

import it.eliasandandrea.chathub.shared.util.ObjectByteConverter;

import java.io.Serializable;

public class Packet implements Serializable {

    private final byte[] data;

    public Packet(byte[] data) {
        this.data = data;
    }

    public Packet(Serializable data) {
        this.data = ObjectByteConverter.serialize(data);
    }

    public byte[] getData() {
        return data;
    }

    public Serializable getSerializable() {
        return (Serializable) ObjectByteConverter.deserialize(data);
    }
}
