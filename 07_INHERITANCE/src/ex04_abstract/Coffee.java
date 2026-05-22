package ex04_abstract;

public abstract class Coffee {
  public String coffeebean;

  public Coffee(String coffeebean){
    this.coffeebean = coffeebean;
  }
 //추상메서드 -> 추상클래스
  //선언부만 있고 구현부가 없는 메서드
  //자식 클래스에게 각 상황에 맞게 오버라이딩 하라고 강제성
  public abstract void taste();

  public void info() {
    System.out.println("원산지: "+ coffeebean);
  }
}
