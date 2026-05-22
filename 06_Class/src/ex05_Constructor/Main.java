package ex05_Constructor;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("k9", 8000, 100);
    car1.drive();
    System.out.println(car1.model);
  }

}
