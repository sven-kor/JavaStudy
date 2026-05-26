package ex03_throws;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("a : ");
    String a = br.readLine();
    System.out.println("b : ");
    String b = br.readLine();

    try {
    Calculator.div(a, b);
    } catch (Exception e){
      System.out.println(e.getMessage());
    }
    // Calculator.mod(a, b);

  }


}
