package ex07_static;

public class Calculator {
  //static 
  //정적 멤버, 클래스 멤버라고 합니다.
  public static final double PI = 3.14159;
  //-> 사용은 해야하니까 private이 아니고 public으로 해야하는데, 막 변경되면 안되니까 final으로 수정을 막는다.

  //인스턴스 필드를 사용하지 않는 유틸리티성 메서드는 굳~이 객체로 접근할 필요가 없다!! -> 정적 메서드로 변경
  static int add(int a, int b){
    return a+b;
  }
}
