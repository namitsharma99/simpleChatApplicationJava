package src.com.code;

public class Player1 extends Person {

  public Player1(int i) {
    super(i);
  }

  public static void main(String[] args) {
    new Thread(new Player1(1)).start();
  }
}
