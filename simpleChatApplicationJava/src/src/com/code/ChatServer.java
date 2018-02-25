package src.com.code;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

  static ServerSocket ss = null;

  public static void main(String[] args) {
    try {
      System.out.println("<<<<<<<<<<<<<<< SERVER >>>>>>>>>>>>>>");
      ss = new ServerSocket(6666);

      while (true) {
        synchronized (ss) {
          Socket s = ss.accept();
          Thread t = new Thread(new ChatServer().new ActualServer(s));
          t.start();
        }
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      try {
        ss.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
  }

  class ActualServer implements Runnable {

    private DataInputStream dis = null;

    public ActualServer(Socket socket) throws IOException {
      System.out.println("Player accepted!");
      dis = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
      while (true) {
        String str = "";
        try {
          str = dis.readUTF();
        } catch (Exception e) {
          System.out.println("ERROR: No input from player!");
          break;
        }
        System.out.println("Player Input: " + str);
      }
    }

  }
}
