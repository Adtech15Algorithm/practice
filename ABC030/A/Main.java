import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
      String line;
      line = stdReader.readline();
      String[] input = line.split(" ");
      int x = Integer.parseInt(input[1]) * Integer.parseInt(input[2]);
      int y = Integer.parseInt(input[0]) * Integer.parseInt(input[3]);
      if (x < y)  { System.out.println("AOKI"); }
      else if (x > y) { System.out.println("TAKAHASHI"); }
      else System.out.println("DRAW");

    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
