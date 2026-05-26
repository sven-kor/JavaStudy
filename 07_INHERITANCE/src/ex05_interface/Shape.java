package ex05_interface;

public interface Shape {
  //상수필드 : 변하지 않는 상수만 허용됨.
  public static final int num = 15;
  //추상클래스!!
  public abstract double getPerimeter(); //둘레 구하기
  double getArea(); //넓이 구하기, public abstract 생략가능.
  
  //원래 추상클래스만 가지려고 만든건데, 지금은 default, static 메서드도 가질 수 있다.
  default void defaultMethod() {
    System.out.println("default");
  }
  static void staticMethod() {
    System.out.println("static");
  }



}
