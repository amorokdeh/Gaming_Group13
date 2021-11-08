package Client;

import java.io.IOException;
import java.net.*;

public class ClientMain {
    private static final int PORT = 8080;
    private static final int MAX = 2065;

    public static void main(String[] args) throws IOException {
        MulticastSocket sock=new MulticastSocket(PORT);
        InetAddress addr=InetAddress.getByName("239.255.255.255");
        InetSocketAddress group = new InetSocketAddress(addr, PORT);
        NetworkInterface netIf = NetworkInterface.getByName("bge0");
        sock.joinGroup(group, netIf);
        byte [] mess=new byte[MAX];
        DatagramPacket packet=new DatagramPacket(mess, mess.length);

            sock.receive(packet);
        String msg = new String(packet.getData(), packet.getOffset(), packet.getLength());
        System.out.println("Ricevuti: " + msg);

    }
}
