package ex02_parameter;

public class Main {
  public static void main(String[] args) {
    // 객체 생성
    ex02_parameter.Car car;
    car = new Car();
    // 마침표로 연산자로 호출하기
    // 메서드로 전달하는 값 : 인자(Argument)
    car.drive("동작대교");
    car.drive("삼청동");

    car.goToGasStation(10);
    car.drive("영등포로터리");
    car.drive("서울 근교");
    car.goToGasStation(10);

  }

}
