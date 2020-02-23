package net.makiru.spigot.tools;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class PingServer {
    private String host;
    private int port;
    private Socket socket = new Socket();
    private String[] data = new String[999];

    public PingServer(String host) {
        this(host, 25565);
    }

    public PingServer(String host, int port) {
        this.host = host;
        this.port = port;
        try {
            socket.connect(new InetSocketAddress(host, port), 1000);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            out.write(0xFE);
            StringBuilder str = new StringBuilder();
            int b;
            while ((b = in.read()) != -1) {
                if (b > 16 && b != 255 && b != 23 && b != 24) {
                    str.append((char) b);
                }
            }
            data = str.toString().split("�");
        } catch (IOException ignored) {
        }
    }

    public boolean isOnline() {
        return socket.isConnected();
    }

    public String getMotd() {
        return this.data[0];
    }

    public int getOnline() {
        return Integer.parseInt(this.data[1]);
    }

    public int getMax() {
        return Integer.parseInt(this.data[2]);
    }

    public void update() {
        try {
            int b;
            this.socket.close();
            this.socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), 1000);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            out.write(0xFE);
            StringBuilder str = new StringBuilder();
            while ((b = in.read()) != -1) {
                if (b > 16 && b != 255 && b != 23 && b != 24) {
                    str.append((char) b);
                }
            }
            data = str.toString().split("�");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

