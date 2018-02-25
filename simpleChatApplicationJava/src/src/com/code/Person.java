package src.com.code;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Person implements Runnable {

  private int playerId;

  public Person(int i) {
    this.playerId = i;
  }

  @Override
  public void run() {
    try {
      System.out.println("<<<<<<<<<<<<<<< Player " + playerId + " >>>>>>>>>>>>>>");
      Socket s = new Socket("localhost", 6666);

      String playerInput;
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());
      do {

        System.out.println("Hey player " + playerId + " Please enter your message for server - ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        playerInput = br.readLine();
        dout.writeUTF(playerInput);

      } while (!"Q".equalsIgnoreCase(playerInput));

      System.out.println("Player " + playerId + " no longer available!");
      dout.close();
      s.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

}
