package ex05_interface;

public class Main {
  public static void main(String[] args) {
    
// 클래스와 똑같이 다형성!! -> 근데 클래스간 결합도를 낮춰서 사용가능
// 클래스 ↔ 클래스 직접 연결
// → 강한 결합
// 클래스 ↔ 인터페이스 연결
// → 느슨한 결합
    Shape[] shapes = { new Rectangle(3,5),
     new Circle(3)
    };
    //*인터페이스가 인터페이스 상속 가능 */

    for (Shape s : shapes){
      System.out.println(s.getArea());
      System.out.println(s.getPerimeter());
    }

  }

}
