package Server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.charset.StandardCharsets;

public class ServerMain {
    private static final int PORT = 8080;

    private static void init() {

    }

    public static void main(String[] args) throws IOException {
            MulticastSocket sock = new MulticastSocket();
            InetAddress addr = InetAddress.getByName("239.255.255.255");
            sock.connect(addr, PORT);
            byte[] mess = "What is your Name? ".getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(mess, mess.length, addr, PORT);

            sock.send(packet);

    }
}
