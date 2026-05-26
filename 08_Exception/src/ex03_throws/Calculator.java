package ex03_throws;

public class Calculator  {
  /**
   * 나누는 메서드
   * @param a : 분모,정수만 가능
   * @param b : 분자,정수만 가능
   * @throws Exception 
   */
  public static void div(String a, String b)throws Exception{
    int x = Integer.parseInt(a);
    int y = Integer.parseInt(b);
    System.out.println("나누기 : "+ x/y );
  }
  //얘는 throws를 안써보면? 된다!-> RuntimeException이라서 실행안된 지금 상태에서는 모른다. -> Unchecked Exception -> 컴파일러가 강제하지 않음.
  public static void mod(String a, String b) {
    int x = Integer.parseInt(a);
    int y = Integer.parseInt(b);
    System.out.println("곱하기 : "+ x*y );
  }
}
