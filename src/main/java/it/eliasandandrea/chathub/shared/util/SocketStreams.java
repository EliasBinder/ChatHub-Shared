package it.eliasandandrea.chathub.shared.util;

import java.io.*;
import java.net.Socket;

public final class SocketStreams {

    private SocketStreams() {
    }

    public static byte[] readFully(final Socket socket) {

        try (final DataInputStream dis = new DataInputStream(socket.getInputStream())) {
            int messageLength = dis.readInt();
            return dis.readNBytes(messageLength);
        } catch (IOException e) {
            Log.warning("Could not read from socket", e);
        }
        return null;
    }

    public static Object readObject(final Socket socket) {
        byte[] data = readFully(socket);
        return ObjectByteConverter.deserialize(data);
    }

    public static void writeObject(final Socket socket, final Object object) {
        try {
            final DataOutputStream os =
                    new DataOutputStream(socket.getOutputStream());
            byte[] data = ObjectByteConverter.serialize(object);
            os.writeInt(data.length);
            os.write(data);
        } catch (IOException e) {
            Log.warning("Could not write object to socket", e);
        }
    }

}
