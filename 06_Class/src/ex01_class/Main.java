package ex01_class;

public class Main {
  public static void main(String[] args) {
    //클래스를 타입으로 가지는 변수는 "객체"다

    //패키지 명시
    ex01_class.Car car;
    //패키지 명시 하지 않는 경우
    //1. 같은 패키지에 있을 때
    //2. java.lang 패키지에 있는 경우(String, System 등)
    //3. import 문을 작성한 경우(패키지 명시를 미리 해 둔 것)

    car = new Car();
    car.model = "g80";
    car.price = 8000;

    System.out.println(car);
  }
}
