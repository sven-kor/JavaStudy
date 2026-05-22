package ex06_encapsulation;

public class Main {
  public static void main(String[] args) {


    //보통 자바 코드는 아래와 같이 짠다.
    //필드를 private값으로 감추고-> 메서드로 접근하게
    Car car3 = new Car();
    //car3.model = "g80" -> 접근 안됨
    //-> public 메서드로 설정해서 가능
    car3.setModel("g80"); 
    //System.out.println(car3.model);//접근이 안됨.
    //public 메서드로 접근
    System.out.println(car3.getMoel());
    

  }
}
