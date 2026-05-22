package ex05_interface;

public class Circle implements Shape {

  // field 
  private double radius;

  //생성자
  public Circle(double radius){
    this.radius = radius;
  }

  //interface구현체는 반드시 모든 추상메서드를 오버라이드 해야한다.
  @Override
  public double getPerimeter() {
    //원 둘레
    return 2*Math.PI*radius;
  }
  @Override
  public double getArea() {
    //원 넓이
    return Math.PI*radius*radius;
  }

}
