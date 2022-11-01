package it.eliasandandrea.chathub.shared.util;

import java.io.*;
import java.net.Socket;

public final class SocketStreams {

    private SocketStreams() {
    }

    public static byte[] readFully(final DataInputStream dis) {
        try {
            int messageLength = dis.readInt();
            return dis.readNBytes(messageLength);
        } catch (IOException e) {
            Log.warning("Could not read from socket", e);
        }
        return null;
    }

    public static Serializable readObject(final DataInputStream dis) {
        byte[] data = readFully(dis);
        return (Serializable) ObjectByteConverter.deserialize(data);
    }

    public static void writeObject(final DataOutputStream dos, final Serializable object) {
        try {
            byte[] data = ObjectByteConverter.serialize(object);
            dos.writeInt(data.length);
            dos.write(data);
            dos.flush();
        } catch (IOException e) {
            Log.warning("Could not write object to socket", e);
        }
    }

}
