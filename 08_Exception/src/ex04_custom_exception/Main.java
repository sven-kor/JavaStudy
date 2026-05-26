package ex04_custom_exception;

public class Main {
  public static void main(String[] args) {
    try {
      throw new MyException("내가만든 예외", 1000);
    } catch (MyException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getErrorCode());
    }
  }

}
