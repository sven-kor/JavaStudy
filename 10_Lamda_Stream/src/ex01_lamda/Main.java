package ex01_lamda;

public class Main {
  public static void main(String[] args) {
    //원래 인터페이스 new 안되지만 추상메서드 구현하면 가능 -> 람다식으로 바로 구현하면서 객체 만드는 것.
    //실행문이 한줄이니까 {}생략
    MyInterface my = () -> System.out.println("나의 첫 람다식");
    my.method();
    //매개변수 한개니까 ()생략
    MyInterface2 my2 = name -> System.out.println(name + "입니다.");
    my2.method("김형준");
    //실행문 한줄이니까 retrun도 생략가능 
    MyInterface3 my3 = () -> "김형준";
    System.out.println(my3.method());


    Calculator cal = (a, b) -> a+b;
    System.out.println(cal.add(5, 10));   

  }
}
