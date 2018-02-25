package src.com.code;

public class Player2 extends Person {

  public Player2(int i) {
    super(i);
  }

  public static void main(String[] args) {
    new Thread(new Player2(2)).start();
  }

}
