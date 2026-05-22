package ex07_static;

public class Main {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    //static
    int result = Calculator.add(1, 3);
    System.out.println(result);
  }
}
